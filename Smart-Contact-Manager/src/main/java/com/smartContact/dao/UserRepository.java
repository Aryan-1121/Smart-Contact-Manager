package com.smartContact.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartContact.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
