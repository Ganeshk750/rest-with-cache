package com.ganesh.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="categories")
@NoArgsConstructor
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryid;
	private String title;
	private int status;
	
	@OneToMany(mappedBy="categories")
	private Set<Item> items;

}
