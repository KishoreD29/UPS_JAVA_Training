package com.example.ups_class.repository;

import com.example.ups_class.studententity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teachers,Long> {
}
