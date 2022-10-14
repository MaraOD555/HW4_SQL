package ru.hogwarts.school.HW4_SQL.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.HW4_SQL.model.Faculty;
import ru.hogwarts.school.HW4_SQL.model.Student;
import ru.hogwarts.school.HW4_SQL.repository.StudentRepository;

import java.util.Collection;

@Service
public class StudentService {
    private final StudentRepository studentRepository; // инжектим интерфейс репозитория, т.к. данные теперь хранятся в БД
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student findStudent(long id) {
        return studentRepository.findById(id).orElse(null); //orElse(null) вместо get, т.к в контроллере джем null, а get null не возвращает
    }
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }
    public void deleteStudents(long id){
        studentRepository.deleteById(id);
    }

    public Collection<Student> findByAge(int age) {
        return studentRepository.findByAge(age); //метод формируется в репозитории
    }

    public Collection<Student> findByAgeBetween(int from, int to) {
        return studentRepository.findByAgeBetween(from, to);
    }
    public Faculty findFaculty(long id) {
    return studentRepository.findFaculty(id);
  }
}

