package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import dao.TodoEntity;
import dao.TodoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<TodoEntity> findAllTodo() {
        return todoRepository.findAll();
    }
}