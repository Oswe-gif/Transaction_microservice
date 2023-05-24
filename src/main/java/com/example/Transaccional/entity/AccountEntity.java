package com.example.Transaccional.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ACCOUNT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class AccountEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="type", nullable = false)
    private String type;
    @Column(name ="money", nullable = false)
    private int money;
    @Column(name ="date_created", nullable = false)
    private String dateCreated;
    @Column(name ="user", nullable = false)
    private int user;
}