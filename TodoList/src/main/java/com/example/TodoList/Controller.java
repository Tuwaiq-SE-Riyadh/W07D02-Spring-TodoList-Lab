package com.example.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "todo")
public class Controller {

//    Get: to get all todos
//    Post: add new todo
//    Put: update todo
//    Delete: delete a todo list

    private final TodoService service;

    @Autowired
    public Controller(TodoService productService) {
        this.service = productService;
    }

    @GetMapping
    public List<Todo> getProducts(@RequestParam(required = false) String filter){
        System.out.println(filter);
        return service.GetTodo();
    }

    @PostMapping
    public Todo addProduct(@RequestBody Todo product){
        return service.AddTodo(product);
    }

    @PutMapping("/{id}")
    public String updateTodo(@PathVariable String id){
        return service.UpdateTodo(id);
    }

    @DeleteMapping ("/{id}")
    public String deleteTodo(@PathVariable String id){
        return service.UpdateTodo(id);
    }
}
