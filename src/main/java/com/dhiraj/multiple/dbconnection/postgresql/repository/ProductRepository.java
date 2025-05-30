package com.dhiraj.multiple.dbconnection.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiraj.multiple.dbconnection.postgresql.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}

