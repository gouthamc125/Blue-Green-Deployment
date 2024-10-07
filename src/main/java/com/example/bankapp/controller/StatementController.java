package com.example.bankapp.controller;

import com.example.bankapp.model.Statement;
import com.example.bankapp.service.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StatementController {

    @Autowired
    private StatementService statementService;

    @GetMapping("/statements")
    public String showStatements(Model model) {
        List<Statement> statements = statementService.getAllStatements();
        model.addAttribute("statements", statements);
        return "statements";  // This refers to the "statements.html" Thymeleaf template
    }
}
