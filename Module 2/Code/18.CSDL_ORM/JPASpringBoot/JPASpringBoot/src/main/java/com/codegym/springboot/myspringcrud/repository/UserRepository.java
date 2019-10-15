package com.codegym.springboot.myspringcrud.repository;

import com.codegym.springboot.myspringcrud.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}