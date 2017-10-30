package com.app.todo.implementation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.todo.model.Todo;

/**
 * Created by Shashank Pandey.
 */
@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}