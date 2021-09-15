package ktpm.luutkha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ktpm.luutkha.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
