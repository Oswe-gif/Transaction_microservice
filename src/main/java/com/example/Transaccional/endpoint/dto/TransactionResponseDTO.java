package com.example.Transaccional.endpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class TransactionResponseDTO {
    private Integer id;
    private int origen;
    private int destination;
    private int amount;
}
