package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUserName(String userName);

	User findByUserNameOrEmail(String username, String email);

}
