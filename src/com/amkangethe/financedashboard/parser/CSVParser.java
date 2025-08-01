package com.amkangethe.financedashboard.parser;

import com.amkangethe.financedashboard.model.Transaction;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    public List<Transaction> parse(String csvPath) throws Exception {
        List<Transaction> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                LocalDate date = LocalDate.parse(cols[0]);
                String category = cols[1];
                double amount = Double.parseDouble(cols[2]);
                list.add(new Transaction(date, category, amount));
            }
        }
        return list;
    }
}