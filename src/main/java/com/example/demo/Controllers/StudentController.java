package com.example.demo.Controllers;

import com.example.demo.DTO.Student;
import com.example.demo.Services.StudentService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Component
@ComponentScan
public class StudentController {
    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(value = "/getOne")
    public Mono<Student> giveMeAStudent(){
        return studentService.getStudent();
    }

    @GetMapping(value = "/hello")
    public Mono<String> init(){
        return Mono.just("Hello");
    }

    @GetMapping(value="/getSome")
    public Flux<Student> giveMeSomeStudets(){
        return studentService.getStudents();
    }



}
