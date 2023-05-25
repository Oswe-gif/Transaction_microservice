package com.example.Transaccional.repository;

import com.example.Transaccional.entity.TransactionEntity;
import lombok.Generated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Generated
@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity,Integer> {
}