package com.taskmanager.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.taskmanager.enums.Status;
import com.taskmanager.taskmanager.model.Task;
import com.taskmanager.taskmanager.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService service;

    @GetMapping("/statuses")
    public Status[] getStatuses(){
        return service.getStatuses();
    }

    @PostMapping
    public Task addTask(@RequestBody Task task){

        return service.createTask(task);
    }

    @PatchMapping("/update-status")
    public Task updateStatus(@RequestBody Task task){

        return service.updateStatus(task);
    }

    @GetMapping
    public List<Task> getTask(){

        return service.getTasks();
    }
}
