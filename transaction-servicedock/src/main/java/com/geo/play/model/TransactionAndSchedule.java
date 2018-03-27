package com.geo.play.model;

import com.geo.play.domain.Schedule;
import com.geo.play.domain.Transaction;

import java.util.List;

public class TransactionAndSchedule {
    private List<Transaction> transactions;
    private List<Schedule> schedules;

    public TransactionAndSchedule(List<Transaction> transactions, List<Schedule> schedules) {
        this.transactions = transactions;
        this.schedules = schedules;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}
