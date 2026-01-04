package com.example.springkadaitodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springkadaitodo.entitiy.ToDo;


public interface ToDoRepository extends JpaRepository<ToDo, Integer>  {
}
