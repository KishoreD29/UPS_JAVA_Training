package com.example.ups_class.repository;

import com.example.ups_class.studententity.students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<students,Long> {
}
