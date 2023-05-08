package Controllers;

import DTO.Student;
import Services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
//@RequestMapping(value = "/api/v1/student")
public class StudentController {
    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(value = "/getOne")
    public Mono<Student> giveMeAStudent(){
        return studentService.getStudent();
    }

    @GetMapping(value="/getSome")
    public Flux<Student> giveMeSomeStudets(){
        return studentService.getStudents();
    }

}
