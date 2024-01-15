package com.whosein.management.repository;

import com.whosein.management.entity.Student;
import com.whosein.management.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
