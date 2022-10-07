package ru.hogwarts.school.HW4_SQL.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.HW4_SQL.repository.StudentRepository;
import ru.hogwarts.school.HW4_SQL.service.FacultyService;

import java.util.Collection;

@Service
public class StudentService {
    private final StudentRepository studentRepository; // инжектим интерфейс репозитория, т.к. данные теперь хранятся в БД
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public FacultyService.Student createStudent(FacultyService.Student student) {
      return studentRepository.save(student);
    }
    public FacultyService.Student findStudent(long id) {
        return studentRepository.findById(id).orElse(null); //orElse(null) вместо get, т.к в контроллере джем null, а get null не возвращает
    }
    public FacultyService.Student editStudent(FacultyService.Student student) {
       return studentRepository.save(student);
    }
    public void deleteStudents(long id){
        studentRepository.deleteById(id);
    }

    public Collection<FacultyService.Student> findByAge(int age) {
        return studentRepository.findByAge(age); //метод формируется в репозитории
    }
}

