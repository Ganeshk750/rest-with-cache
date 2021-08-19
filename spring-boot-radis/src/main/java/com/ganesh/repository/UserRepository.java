package com.ganesh.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ganesh.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Transactional
	@Modifying
	@Query("update User u set u.name=?2 where u.id=?1")
	User updateAddress(long id, String name);

}
