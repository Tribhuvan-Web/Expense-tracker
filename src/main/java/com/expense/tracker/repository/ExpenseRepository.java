package com.expense.tracker.repository;

import com.expense.tracker.models.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expenses, Long> {
}
