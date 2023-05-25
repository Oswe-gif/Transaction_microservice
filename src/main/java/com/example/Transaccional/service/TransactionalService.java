package com.example.Transaccional.service;
import com.example.Transaccional.endpoint.dto.AccountResponseDTO;
import com.example.Transaccional.endpoint.dto.DepositMoneyUserDto;
import com.example.Transaccional.endpoint.dto.TransactionDto;
import com.example.Transaccional.endpoint.dto.TransactionResponseDTO;
import com.example.Transaccional.entity.AccountEntity;
import com.example.Transaccional.entity.TransactionEntity;
import com.example.Transaccional.repository.AccountRepository;
import com.example.Transaccional.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class TransactionalService {
    RestTemplate restTemplate;
    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;
    public TransactionResponseDTO doTransaction(TransactionDto transactionDto) {

        if (!this.accountRepository.existsById(transactionDto.getDestination())) {
            throw new RuntimeException("Verifique la cuenta de destino.");
        }
        if (!this.accountRepository.existsById(transactionDto.getOrigen())) {
            throw new RuntimeException("Verifique la cuenta de origen.");
        }

        AccountEntity senderAccount = accountRepository.findById(transactionDto.getOrigen()).orElse(new AccountEntity());
        if (senderAccount.getMoney()<transactionDto.getAmount()) {
            throw new RuntimeException("Fondos insuficientes.");
        }

        accountRepository.depositMoney(transactionDto.getAmount(),transactionDto.getDestination());
        accountRepository.depositMoney(-1*transactionDto.getAmount(),transactionDto.getOrigen());
        transactionRepository.save(new TransactionEntity(transactionDto.getId(), transactionDto.getOrigen(),transactionDto.getDestination(),transactionDto.getAmount()));
        return new TransactionResponseDTO(transactionDto.getId(), transactionDto.getOrigen(),transactionDto.getDestination(),transactionDto.getAmount());
    }
    public AccountResponseDTO depositMoney(DepositMoneyUserDto depositMoneyUserDto) {
        if(!this.accountRepository.existsById(depositMoneyUserDto.getAccountNumber())){
            throw new RuntimeException("La cuenta a la que quiere depositar no existe.");
        }
        accountRepository.depositMoney(depositMoneyUserDto.getMoneyAmount(), depositMoneyUserDto.getAccountNumber());
        AccountEntity accountEntity= accountRepository.findById(depositMoneyUserDto.getAccountNumber()).orElse(new AccountEntity());
        return new AccountResponseDTO(accountEntity.getId(),accountEntity.getType(),accountEntity.getMoney(),accountEntity.getDateCreated(),accountEntity.getUser());
    }
}
