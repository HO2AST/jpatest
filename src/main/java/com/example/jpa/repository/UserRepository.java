package com.example.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
