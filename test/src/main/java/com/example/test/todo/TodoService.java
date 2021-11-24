package com.example.test.todo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todos = new ArrayList<Todo>();

    public List<Todo> getTodos(){

        return  todos;
    }

    public Todo addTodo(Todo todo){
        todos.add(todo);
        return todo;
    }

    public String getTodo(String id) {
        return id;
    }
}
