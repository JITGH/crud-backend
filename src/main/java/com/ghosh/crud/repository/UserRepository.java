package com.ghosh.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghosh.crud.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
}
