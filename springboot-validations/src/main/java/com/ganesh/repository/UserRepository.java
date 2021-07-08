package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
