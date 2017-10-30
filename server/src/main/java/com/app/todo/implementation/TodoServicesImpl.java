package com.app.todo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.todo.implementation.repository.TodoRepository;
import com.app.todo.model.Todo;
import com.app.todo.service.TodoServices;


/**
 * 
 * This class will perform all the core operations related to Todo-Application.
 * 
 * 
 * Created by Shashank Pandey.
 */

@Service("todoServices")
public class TodoServicesImpl implements TodoServices {

	@Autowired
	TodoRepository todoRepository;

	/*
	 * 
	 * This method will show all the todo items present in the db with status. (Completed, pending)
	 * @param sort - to get all the todo list items sorted
	 * 
	 */
	@Override
	public List<Todo> getAllTodoItems(Sort sort) {

		return todoRepository.findAll(sort);
	}

	/*
	 * 
	 * This method will save the todo items.
	 * @param todo - items of todo type.
	 * 
	 */
	@Override
	public Todo saveTodoItem(Todo todo) {

		return todoRepository.save(todo);

	}

	/*
	 * 
	 * This method will get todo item by its id.
	 * @param id - todo item id.
	 * 
	 */
	@Override
	public Todo getTodoById(String id) {

		return todoRepository.findOne(id);
	}

	/*
	 * 
	 * This method will delete the todo items
	 * @param id - todo item id.
	 * 
	 */
	@Override
	public void deleteTodoItem(String id) {
		todoRepository.delete(id);

	}

}
