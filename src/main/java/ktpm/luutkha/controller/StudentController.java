package ktpm.luutkha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ktpm.luutkha.entity.Student;
import ktpm.luutkha.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }

    @PostMapping
    public Student addNewStudent(@RequestBody Student student) {
        student.setId(null);
        studentService.save(student);
        return student;
    }

    @PutMapping("/{studentId}")
    public Student apdateStudent(@RequestBody Student student, @PathVariable Integer studentId) {
        student.setId(studentId);
        studentService.save(student);
        return student;
    }

    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId) {
        studentService.delete(studentId);
        return "deleted Student id =" + studentId;
    }

}