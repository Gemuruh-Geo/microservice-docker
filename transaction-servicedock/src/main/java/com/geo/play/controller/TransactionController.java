package com.geo.play.controller;

import com.geo.play.domain.Transaction;
import com.geo.play.model.TransactionAndSchedule;
import com.geo.play.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = "/arts_allTransaction",method = RequestMethod.GET)
    public List<Transaction> findAllAvailableTransaction(){
        List<Transaction> transactions = transactionService.findAllTransaction();
        return transactions;
    }

    @RequestMapping(value="/arts_transactionAndSchedule",method = RequestMethod.GET)
    public TransactionAndSchedule getTransactionAndSchedule() throws IOException {
        TransactionAndSchedule transactionAndSchedule = transactionService.getTransactionAndSchedule();
        return transactionAndSchedule;
    }
}
