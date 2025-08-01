package com.amkangethe.financedashboard.model;

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private String category;
    private double amount;

    public Transaction(LocalDate date, String category, double amount) {
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

    // getters/setters...
}
