package com.exemple.gestion.BookStore.microservicecoursemanagement.repository;

import com.exemple.gestion.BookStore.microservicecoursemanagement.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByUserId(Long userId);

    List<Transaction> findAllByCourseId(Long courseId);
}
