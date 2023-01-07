package com.cyl.microservicecoursemanagement.repository;

import com.cyl.microservicecoursemanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepositiry extends JpaRepository<Transaction, Long> {


    List<Transaction> findAllByUserId(Long userId);

    List<Transaction> findAllByCourseId(Long courseId);

}
