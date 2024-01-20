package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	// the findByUsername will return a single string instead of List<User> because as "username" is a 
	// unique constraint for a particular we can only have one record....
	User findByUsername(String username);
	
}
