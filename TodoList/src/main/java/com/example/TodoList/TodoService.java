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
    private List<Todo> todos = new ArrayList<Todo>();

    public List<Todo> GetTodo(){
        return todos;
    }

    public Todo AddTodo(Todo todo){
        todos.add(todo);
        return todo;
    }

    public String UpdateTodo(int id, String name) {
        for(Todo todo:todos){
            int compareID =todo.getId();
            if(compareID==id){
                todo.setName(name);
            }
        }
        return "updated";
    }
    public String DeleteTodo(int id) {
        for(Todo todo:todos){
            int compareID =todo.getId();
            if(compareID==id){
                todos.remove(todo);
                break;
            }
        }
        return "deleted";
    }
}
