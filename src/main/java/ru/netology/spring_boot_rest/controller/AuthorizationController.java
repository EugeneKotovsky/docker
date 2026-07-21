package ru.netology.spring_boot_rest.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import ru.netology.spring_boot_rest.FromQueryUser;
import ru.netology.spring_boot_rest.domain.Authorities;
import ru.netology.spring_boot_rest.domain.User;
import ru.netology.spring_boot_rest.service.AuthorizationService;

@RestController
public class AuthorizationController {

    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid @ModelAttribute @FromQueryUser User user) {
        return service.getAuthorities(user);
    }
}