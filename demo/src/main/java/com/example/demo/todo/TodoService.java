package com.example.demo.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todo = new ArrayList<Todo>();

    public List<Todo> getTodos(){

        return  todo;
    }

    public List<Todo> addTodo(Todo product){
        todo.add(product);
        return todo;
    }

    public Todo getTodo(String id) {
        Todo temp = new Todo(0,"Not found");
        for(int i = 0 ; i < todo.size() ; i++){
            if(todo.get(i).getId() == Integer.valueOf(id)){
                temp = todo.get(i);
                break;
            }
        }

        return temp;
    }

    public List<Todo> delTodo(String id) {
        for(int i = 0 ; i < todo.size() ; i++){
            if(todo.get(i).getId() == Integer.valueOf(id)){
                todo.remove(i);
                break;
            }
        }
        return todo;
    }

    public List<Todo> updateTodo(Todo _todo){

        for(int i = 0 ; i < todo.size() ; i++){
            if(todo.get(i).getId() == _todo.getId()){
                todo.set(i,_todo);
                return todo;
            }
        }

        todo.add(_todo);
        return todo;
    }
}
