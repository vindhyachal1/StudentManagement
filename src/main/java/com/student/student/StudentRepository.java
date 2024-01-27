package com.student.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByBatch(String batch);

    // Additional queries if needed

    // ...
}
