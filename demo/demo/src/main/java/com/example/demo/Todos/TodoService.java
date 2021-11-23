package com.example.demo.Todos;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> Todos = new ArrayList<Todo>();

    public List<Todo> getTodos(){

        return  Todos;
    }

    public Todo addTodo(Todo todo){
        Todos.add(todo);
        return todo;
    }

    public Todo updateTodo(int id, Todo name) {
        Todo result=null;
        for(Todo t: Todos){
            if(t.getId()==id){
                t.setName(name.getName());
                result=t;
            }
        }
        return result;
    }


    public List<Todo> deletTodo(int id){
        for(Todo t: Todos){
            if(t.getId()==id){
                Todos.remove(t);
            }
        }
        return Todos;
    }
}
