package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dao.TodoEntity;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ToDoController {

    private final TodoService todoService;

    @GetMapping("/top")
    public String top(Model model){
        List<TodoEntity> todoEntityList =  todoService.findAllTodo(); //①
        model.addAttribute("todoList", todoEntityList); //②
        return "top";
    }
}

