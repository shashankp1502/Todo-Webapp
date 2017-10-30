package com.app.todo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.todo.implementation.repository.TodoRepository;
import com.app.todo.model.Todo;
import com.app.todo.service.TodoServices;

@Service("todoServices")
public class TodoServicesImpl implements TodoServices {

	@Autowired
	TodoRepository todoRepository;

	@Override
	public List<Todo> getAllTodoItems(Sort sort) {

		return todoRepository.findAll(sort);
	}

	@Override
	public Todo saveTodoItem(Todo todo) {

		return todoRepository.save(todo);

	}

	@Override
	public Todo getTodoById(String id) {

		return todoRepository.findOne(id);
	}

	@Override
	public void deleteTodoItem(String id) {
		todoRepository.delete(id);

	}

}
