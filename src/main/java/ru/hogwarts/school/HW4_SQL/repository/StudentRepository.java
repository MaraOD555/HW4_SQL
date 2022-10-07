package ru.hogwarts.school.HW4_SQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.HW4_SQL.service.FacultyService;

import java.util.List;

public interface StudentRepository extends JpaRepository<FacultyService.Student, Long> { //Spring ищет сущности по определенным полям
    List<FacultyService.Student> findByAge(int age);
}
