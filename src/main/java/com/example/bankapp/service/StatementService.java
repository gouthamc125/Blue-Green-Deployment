package com.example.bankapp.service;

import com.example.bankapp.model.Statement;
import com.example.bankapp.repository.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementService {

    @Autowired
    private StatementRepository statementRepository;

    public List<Statement> getAllStatements() {
        return statementRepository.findAll();
    }

    public Statement getStatementById(Long id) {
        return statementRepository.findById(id).orElse(null);
    }

    public Statement saveStatement(Statement statement) {
        return statementRepository.save(statement);
    }

    public void deleteStatement(Long id) {
        statementRepository.deleteById(id);
    }
}
