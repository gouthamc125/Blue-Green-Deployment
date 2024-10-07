package com.example.bankapp.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Statement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statementType;  // Example: "Monthly Statement", "Annual Statement"
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal balance;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Statement() {

    }

    public Statement(String statementType, LocalDateTime startDate, LocalDateTime endDate, BigDecimal balance, Account account) {
        this.statementType = statementType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.balance = balance;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
