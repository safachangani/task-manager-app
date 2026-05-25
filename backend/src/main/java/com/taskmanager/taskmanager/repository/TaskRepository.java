package com.taskmanager.taskmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.taskmanager.taskmanager.model.Task;

public interface TaskRepository extends MongoRepository<Task,String>{
    
}
