package com.example.Transaccional.endpoint;

import com.example.Transaccional.endpoint.dto.DepositMoneyUserDto;
import com.example.Transaccional.endpoint.dto.TransactionDto;
import com.example.Transaccional.service.TransactionalService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;

@Component
@AllArgsConstructor
public class TransactionListenerRabbitMQ {
    private TransactionalService transactionalService;
    @Bean
    public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory) {
        final var rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(conversor());
        return rabbitTemplate;
    }
    @Bean
    public Jackson2JsonMessageConverter conversor(){
        return new Jackson2JsonMessageConverter();
    }

    @RabbitListener(queues = {"transferences"})
    public void doTransaction(TransactionDto transactionDto) {
        transactionalService.doTransaction(transactionDto);
    }

    @RabbitListener(queues = {"deposits"})
    public void depositMoney(DepositMoneyUserDto depositMoneyUserDto) {
        transactionalService.depositMoney(depositMoneyUserDto);
    }
}
