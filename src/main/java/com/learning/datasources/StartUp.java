package com.learning.datasources;


import com.learning.datasources.logic.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartUp {

    private final StudentService studentService;

    @EventListener(ApplicationReadyEvent.class)
    public void startUp() {
        System.out.println("APP Started Successfully");

        System.out.println(this.studentService.findAllStudents());
        System.out.println(this.studentService.findAllStudentsLive());

        System.exit(0);
    }
}
