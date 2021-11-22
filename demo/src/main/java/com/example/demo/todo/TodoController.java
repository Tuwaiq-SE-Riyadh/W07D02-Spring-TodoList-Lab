package com.example.demo.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path= "todo")
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
    public List<Todo> addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }



    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable String id){
        return todoService.getTodo(id);
    }

    @DeleteMapping("/{id}")
    public List<Todo> delTodo(@PathVariable String id){
        return todoService.delTodo(id);
    }

    @PutMapping()
    public List<Todo> updateTodo(@RequestBody Todo todo){
        return todoService.updateTodo(todo);
    }

}
