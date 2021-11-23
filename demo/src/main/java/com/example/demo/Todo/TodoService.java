package com.example.demo.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todo = new ArrayList<Todo>(Arrays.asList(
            new Todo(1, "fahad"), new Todo(2, "Muhammed"), new Todo(3, "Nora")
    ));

    public List<Todo> getTodo() {
        return todo;
    }

    public void addTodo(Todo T) {
        todo.add(T);
    }

    public void update(Todo t) {
        for (Todo currentTodo : todo) {
            if (currentTodo.getId() == t.getId()) {
                currentTodo.setName(t.getName());
            }
        }

    }

    public Todo deleteTodo(int id) {
        Todo deleted;
        for (Todo currentTodo : todo) {
            if (currentTodo.getId() == id) {
                deleted = currentTodo;
                todo.remove(currentTodo);
                return deleted;
            }

        }

        return null;
    }
}
