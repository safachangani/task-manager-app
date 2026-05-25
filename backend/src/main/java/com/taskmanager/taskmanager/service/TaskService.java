package com.taskmanager.taskmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanager.taskmanager.enums.Status;
import com.taskmanager.taskmanager.model.Task;
import com.taskmanager.taskmanager.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    TaskRepository repository;

    // get status
    public Status[] getStatuses(){
        return Status.values();
    }

    public Task createTask(Task task){
        return repository.save(task);
    }

    public Task updateStatus(Task task){

        Task existingTask = repository.findById(task.getId())
                                       .orElseThrow();
        existingTask.setStatus(task.getStatus());

        return repository.save(existingTask);
    }

    public List<Task> getTasks(){
        return repository.findAll();
    }

    
}
