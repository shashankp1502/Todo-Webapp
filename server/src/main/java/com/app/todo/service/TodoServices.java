package com.app.todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.app.todo.model.Todo;

/**
 * Created by Shashank Pandey.
 */

@Validated
public interface TodoServices {
	

	/*
	 * 
	 * This method will show all the todo items present in the db with status. (Completed, pending)
	 * @param sort - to get all the todo list items sorted
	 * 
	 */
	List<Todo> getAllTodoItems(Sort sort);
		
	/*
	 * 
	 * This method will save the todo items.
	 * @param todo - items of todo type.
	 * 
	 */
	Todo saveTodoItem(Todo todo);
	
	/*
	 * 
	 * This method will get todo item by its id.
	 * @param id - todo item id.
	 * 
	 */
	Todo getTodoById(String id);
		
	/*
	 * 
	 * This method will delete the todo items
	 * @param id - todo item id.
	 * 
	 */
	void deleteTodoItem(String id);
	
}
