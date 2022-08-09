package com.application.SpringBootCrudJpaH2db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.SpringBootCrudJpaH2db.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
