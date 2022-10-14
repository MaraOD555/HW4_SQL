package ru.hogwarts.school.HW4_SQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.HW4_SQL.model.Faculty;
import ru.hogwarts.school.HW4_SQL.model.Student;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { //Spring ищет сущности по определенным полям
    List<Student> findByAge(int age);

    List<Student> findByAgeBetween(int from, int to);

    Faculty findFaculty(long id);
}
