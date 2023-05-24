package com.example.Transaccional.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Data
@AllArgsConstructor
@Generated
public class AccountResponseDTO {
    private Integer id;
    private String type;
    private int money;
    private String dateCreated;
    private int user;
}
