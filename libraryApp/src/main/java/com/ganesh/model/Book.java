package com.ganesh.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="book")
public class Book {
	
	private Long id;
	private String name;
	private String description;

}
