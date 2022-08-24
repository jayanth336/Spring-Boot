package com.application.SpringCrud2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.SpringCrud2.entity.User;

@Repository
public interface SpringCrud2Repository extends JpaRepository<User, Integer> {

}
