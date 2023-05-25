package com.example.Transaccional.repository;

import com.example.Transaccional.entity.AccountEntity;
import lombok.Generated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Generated
@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
    @Modifying
    @Query(value = "update ACCOUNT a set a.MONEY = a.Money+ :money  where a.ID = :idAccount",nativeQuery = true)
    void depositMoney(@Param("money") int money,@Param("idAccount") int idAccount);

}