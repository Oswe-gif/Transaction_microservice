package com.example.Transaccional.endpoint.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Generated
@NoArgsConstructor
public class TransactionDto {
    private int id;
    private int origen;
    private int destination;
    private int amount;

}
