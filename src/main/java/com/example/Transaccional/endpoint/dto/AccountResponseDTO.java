package com.example.Transaccional.endpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@Generated
@NoArgsConstructor
public class AccountResponseDTO {
    private Integer id;
    private String type;
    private int money;
    private String dateCreated;
    private int user;
}
