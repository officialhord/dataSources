package com.learning.datasources.logic.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @RequestMapping("/create")
    public String createStudent(String studentName){

        return "created";
    }
}
