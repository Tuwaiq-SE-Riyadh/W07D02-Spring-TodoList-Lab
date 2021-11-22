package com.example.TodoList;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
//    AddTodo
//            GetTodo
//    UpdateTodo
//            DeleteTodo
    private List<Todo> products = new ArrayList<Todo>();

    public List<Todo> GetTodo(){
        return products;
    }

    public Todo AddTodo(Todo todo){
        products.add(todo);
        return todo;
    }

    public String UpdateTodo(String id) {
        return id;
    }
    public String DeleteTodo(String id) {
        return id;
    }
}
