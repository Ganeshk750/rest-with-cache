package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
