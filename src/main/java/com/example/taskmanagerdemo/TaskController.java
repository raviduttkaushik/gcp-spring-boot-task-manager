package com.example.taskmanagerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    public Task task1;

    @PostMapping("/")
    public ResponseEntity responseBody(String task){
        ObjectMapper objectMapper=new ObjectMapper();
        task1= objectMapper.readValue(task,Task.class);

        return new ResponseEntity(HttpStatus.OK);
    }
}
