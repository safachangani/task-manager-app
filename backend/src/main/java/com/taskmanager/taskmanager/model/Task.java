package com.taskmanager.taskmanager.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.taskmanager.taskmanager.enums.Status;

import lombok.Data;

@Data
@Document(collection = "Tasks")
public class Task {

    @Id
    private String id;
    private String taskName;
    private Status status = Status.PENDING;
    private boolean isDeleted = false;
    private LocalDateTime createdOn = LocalDateTime.now();
    
}
