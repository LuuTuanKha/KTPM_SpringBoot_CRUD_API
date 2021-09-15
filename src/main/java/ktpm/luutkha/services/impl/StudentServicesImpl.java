package ktpm.luutkha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ktpm.luutkha.entity.Student;
import ktpm.luutkha.repository.StudentRepo;
import ktpm.luutkha.services.StudentService;

@Service
public class StudentServicesImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.getById(id);
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
	}

	@Override
	public void delete(Integer studentId) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentId);
		
	}

    
    
}