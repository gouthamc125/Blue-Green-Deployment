package com.example.bankapp.repository;

import com.example.bankapp.model.Statement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Long> {
    // Custom query methods can be added if needed
}
