package com.geo.play.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geo.play.domain.Schedule;
import com.geo.play.domain.Transaction;
import com.geo.play.model.TransactionAndSchedule;
import com.geo.play.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{
    private static final Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);
    @Value("${spring.schedule-service}")
    private String hostSchedule;
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final ObjectMapper om = new ObjectMapper();
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transaction> findAllTransaction() {
        return transactionRepository.findAll();
    }

    @Override
    public TransactionAndSchedule getTransactionAndSchedule() throws IOException {
        List<Transaction> transactions = findAllTransaction();

        String url = hostSchedule+"/schedule/getAllSchedule";
        logger.info("URL IS: {}",url);
        String result = restTemplate.getForObject(url,String.class);
        List<Schedule> schedules = om.readValue(result,new TypeReference<List<Schedule>>(){});

        TransactionAndSchedule transactionAndSchedule = new TransactionAndSchedule(transactions,schedules);
        return transactionAndSchedule;
    }
}
