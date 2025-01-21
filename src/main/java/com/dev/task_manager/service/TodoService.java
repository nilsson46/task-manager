package com.dev.task_manager.service;

import com.dev.task_manager.model.Todo;
import com.dev.task_manager.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }
}
