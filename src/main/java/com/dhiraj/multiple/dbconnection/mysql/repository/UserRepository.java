package com.dhiraj.multiple.dbconnection.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhiraj.multiple.dbconnection.mysql.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}