package com.ganesh.service.impl;

import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.config.CacheNamespaceHandler;
import org.springframework.stereotype.Service;

import com.ganesh.model.Book;
import com.ganesh.repository.BookRepository;
import com.ganesh.service.BookService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
	
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		logger.info("adding book with Id - {}", book.getId());
		return bookRepository.save(book);
	}

	@Override
	@CachePut(cacheNames = "books", key = "#book.id")
	public Book updateBook(Book book) {
		bookRepository.updateAddress(book.getId(), book.getName());
		logger.info("Book update with new name");
		return book;
	}

	@Override
	@Cacheable(cacheNames = "books", key = "#id")
	public Book getBook(long id) {
		logger.info("fetching book from db");
		Optional<Book> book = bookRepository.findById(id);
		if(book.isPresent()) {
			return book.get();
		}else {
			return new Book();
		}
	}

	@Override
	@CacheEvict(cacheNames = "books", key = "#id")
	public String deleteBook(long id) {
		bookRepository.deleteById(id);
		return "Book deleted";
	}

}
