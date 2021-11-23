package com.example.demo.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "Todo")
public class TodoController {
    public final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodo() {
        return todoService.getTodo();
    }
//    @GetMapping("/allTodo")
//    public List<Todo> getAllTodo() {
//        return todoService.getTodo();
//    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo T) {
        todoService.addTodo(T);
        return T;
    }

    @PutMapping
    public Todo updateTodo(@RequestBody Todo T) {
        todoService.update(T);
        return T;
    }
    @DeleteMapping
    public Todo deleteTodo(@PathVariable int id ) {

        return todoService.deleteTodo(id);
    }
}
