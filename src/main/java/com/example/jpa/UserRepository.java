package com.example.jpa;

import org.springframework.data.repository.CrudRepository;
import com.example.jpa.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
