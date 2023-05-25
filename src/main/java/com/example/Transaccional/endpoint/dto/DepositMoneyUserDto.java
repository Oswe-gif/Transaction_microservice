package com.example.Transaccional.endpoint.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Generated
@NoArgsConstructor
public class DepositMoneyUserDto {
    private int moneyAmount;
    private int accountNumber;
}
