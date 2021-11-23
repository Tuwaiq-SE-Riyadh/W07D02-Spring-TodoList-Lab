package com.example.lab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ToDoService {

    public List<ToDo> Todo = new ArrayList<ToDo>();

    public List<ToDo> GetTodo() {
        return Todo;
    }
    public ToDo AddTodo(ToDo todo) {
        Todo.add(todo);
        return todo;
    }
    public ToDo UpdateTodo(int id, ToDo todo) {
        ToDo result = null;
        for (ToDo t : Todo){
            if(t.getId() == id){
                t.setId(todo.getId());
                t.setName(todo.getName());
                result = t;
            }
        }
        return result;
    }
    public String DeleteTodo(int id) {
        for(ToDo t:Todo){
            if(t.getId()==id){
                Todo.remove(t);
                break;
            }
        }
        return "deleted";
    }

}
