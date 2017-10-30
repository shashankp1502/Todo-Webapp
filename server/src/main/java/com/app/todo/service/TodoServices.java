package com.app.todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.app.todo.model.Todo;

@Validated
public interface TodoServices {
	

	List<Todo> getAllTodoItems(Sort sort);
		
	Todo saveTodoItem(Todo todo);
	
	Todo getTodoById(String id);
		
	void deleteTodoItem(String id);
	
}
