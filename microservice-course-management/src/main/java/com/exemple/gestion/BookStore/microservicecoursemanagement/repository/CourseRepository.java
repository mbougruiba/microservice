package com.exemple.gestion.BookStore.microservicecoursemanagement.repository;


import com.exemple.gestion.BookStore.microservicecoursemanagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}