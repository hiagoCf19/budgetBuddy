package com.BudgetBuddy.demo.presentation.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TesteController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Rota pública acessada!";
    }

    @GetMapping("/user")
    public String userEndpoint(Authentication authentication) {
        return "Usuário autenticado: " + authentication.getName();
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminEndpoint() {
        return "Acesso permitido para ADMIN!";
    }
}
