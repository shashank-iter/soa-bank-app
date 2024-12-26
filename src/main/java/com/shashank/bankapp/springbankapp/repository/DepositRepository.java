package com.shashank.bankapp.springbankapp.repository;

import com.shashank.bankapp.springbankapp.domain.entity.Deposits;
import com.shashank.bankapp.springbankapp.domain.entity.Withdrawals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @project spring-bank-app
 * @autor shashank on 2020-01-16
 */
@Repository
public interface DepositRepository extends JpaRepository<Deposits, Long> {

    List<Deposits> findTransactionsByCustomerAccountId(long id);
}
