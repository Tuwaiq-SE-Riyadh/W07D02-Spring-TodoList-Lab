package com.example.demo.Todos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "todos")
public class TodoController {

    private final TodoService todoservice;


    @Autowired
    public TodoController(TodoService todoservice) {
        this.todoservice = todoservice;
    }

    @GetMapping
    public List<Todo> getTodos(@RequestParam(required = false) String filter){
        System.out.println(filter);
        return todoservice.getTodos();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoservice.addTodo(todo);
    }



    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable int id,@RequestBody Todo name){
        return todoservice.updateTodo(id,name);

    }

    @DeleteMapping ("/{id}")
    public List<Todo> deletTodo(@PathVariable int id){
        return todoservice.deletTodo(id);

    }


}
