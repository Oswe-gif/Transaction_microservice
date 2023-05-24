package com.example.Transaccional.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TRANSACTION")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Generated
public class TransactionEntity {
    @Id
    @Column(name ="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="origen", nullable = false)
    private int origen;
    @Column(name ="destination", nullable = false)
    private int destination;
    @Column(name ="amount", nullable = false)
    private int amount;
}