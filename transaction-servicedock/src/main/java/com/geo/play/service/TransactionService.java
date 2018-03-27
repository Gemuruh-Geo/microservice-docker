package com.geo.play.service;

import com.geo.play.domain.Transaction;
import com.geo.play.model.TransactionAndSchedule;

import java.io.IOException;
import java.util.List;

public interface TransactionService {
    List<Transaction> findAllTransaction();
    TransactionAndSchedule getTransactionAndSchedule() throws IOException;
}
