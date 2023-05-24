package com.example.Transaccional.repository;

import com.example.Transaccional.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity,Integer> {
}