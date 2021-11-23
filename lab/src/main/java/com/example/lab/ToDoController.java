package com.example.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {this.toDoService = toDoService;}

    @GetMapping
    public List<ToDo> GetTodo(){
        return toDoService.GetTodo();
    }

    @PostMapping
    public ToDo addProduct(@RequestBody ToDo toDo){
        return toDoService.AddTodo(toDo);
    }

    @PutMapping("/{id}")
    public ToDo UpdateTodo(@PathVariable int id , @RequestBody ToDo toDo){
        return toDoService.UpdateTodo(id,toDo);
    }

    @DeleteMapping ("/{id}")
    public String deleteTodo(@PathVariable int id) {
        return toDoService.DeleteTodo(id);
    }
}
