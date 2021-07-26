package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.entity.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

}
