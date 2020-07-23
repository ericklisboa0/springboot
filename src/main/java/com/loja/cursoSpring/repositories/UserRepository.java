package com.loja.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.cursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
