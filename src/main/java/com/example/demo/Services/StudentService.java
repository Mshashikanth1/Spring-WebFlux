package com.example.demo.Services;

import com.example.demo.DTO.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@Component
@ComponentScan
public class StudentService {
    public Mono<Student> getStudent(){
        return Mono.just(new Student(1L,"shashi","A+"));
    }

    public Flux<Student> getStudents(){
        return Flux.just(
                new Student(1L,"shashi","A+"),
                new Student(1L,"ravi","B+"),
                new Student(1L,"mahesh","C"),
                new Student(1L,"rajesh","F")
        );
    }

}
