package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoEntity;
import com.example.demo.dao.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
	@Autowired
    private final TodoRepository todoRepository;

    public void setTodo(TodoForm formData) {
        TodoEntity todo = new TodoEntity();
        todo.setTitle(formData.getTitle());
        todo.setDeadline(formData.getDeadline());
        todoRepository.save(todo);
    }
    
    public List<TodoEntity> findAllTodo() {
        return todoRepository.findAll();
    }
   
}