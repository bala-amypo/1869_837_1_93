package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Auth")
public class AuthController {

    @PostMapping("/login")
    @Operation(summary = "Login (dummy, no JWT)")
    public Map<String, String> login(@RequestBody Map<String, String> body) {
        return Map.of("message", "Login successful (JWT disabled)");
    }
}
