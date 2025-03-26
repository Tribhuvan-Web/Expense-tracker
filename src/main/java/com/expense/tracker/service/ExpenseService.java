package com.expense.tracker.service;

import com.expense.tracker.models.Expenses;
import com.expense.tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    private Expenses save(Expenses expenses) {
        return expenseRepository.save(expenses);
    }
}
