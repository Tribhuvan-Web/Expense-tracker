package com.expense.tracker.repository;

import com.expense.tracker.models.MonthlyIncome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyRepository extends JpaRepository<MonthlyIncome, Long> {
}
