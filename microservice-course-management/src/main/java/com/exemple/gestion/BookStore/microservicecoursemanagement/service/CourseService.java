package com.exemple.gestion.BookStore.microservicecoursemanagement.service;



import com.exemple.gestion.BookStore.microservicecoursemanagement.entity.Course;
import com.exemple.gestion.BookStore.microservicecoursemanagement.entity.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}
