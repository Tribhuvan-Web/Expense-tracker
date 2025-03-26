package com.expense.tracker.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String material;
    private Long amount;
    private String description;
    private LocalDate date;
    private String month;
    private String year;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
