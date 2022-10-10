package ru.hogwarts.school.HW4_SQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.HW4_SQL.model.Faculty;
import ru.hogwarts.school.HW4_SQL.model.Student;

import java.util.Collection;
import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByColor(String color);

    List<Faculty> findByNameIgnoreCase (String name);

    List<Faculty> findByColorIgnoreCase(String color);
   // Faculty findFacultyByStudents(Student student);
}
