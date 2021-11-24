package com.example.test.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "products")

public class TodoController {
    private final TodoService todoService;


    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodos(@RequestParam(required = false) String filter){
        System.out.println(filter);
        return todoService.getTodos();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @GetMapping("/{id}")
    public String getTodo(@PathVariable String id){
        return todoService.getTodo(id);

    }

}