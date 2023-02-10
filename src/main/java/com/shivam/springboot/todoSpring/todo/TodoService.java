package com.shivam.springboot.todoSpring.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "shivam", "Get AWS Certified 1", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "shivam", "Learn DevOps 1", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "shivam", "Learn Full Stack Development 1", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {

        return todos.stream().filter(todo -> todo.getUsername().equalsIgnoreCase(username)).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, Boolean done) {

        Todo todo = new Todo(++todosCount, username, description, targetDate, done);
        todos.add(todo);

    }

    public void deleteById(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo findById(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
    }

    public void updateTodo(int id, Todo updatedTodo) {
        todos.stream().filter(obj -> obj.getId() == id).findFirst()
                .map(obj -> {
                    int index = todos.indexOf(obj);
                    todos.set(index, updatedTodo);
                    return true;
                }).orElse(false);
    }
}
