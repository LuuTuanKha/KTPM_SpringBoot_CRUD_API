package ktpm.luutkha.services;

import java.util.List;

import ktpm.luutkha.entity.Student;

public interface StudentService {

    List<Student> findAll();

    Student findById(Integer id);

    void save(Student student);

    void delete(Integer studentId);

}