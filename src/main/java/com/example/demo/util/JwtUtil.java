package com.example.demo.util;

import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.UserDetails;

@Component
public class JwtUtil {

    public String generateToken(String email, Long userId, String role){
        return "dummy-token";
    }

    public boolean validateToken(String token, UserDetails userDetails){
        return true;
    }

    public String extractUsername(String token){
        return "user@example.com";
    }

    public Long extractUserId(String token){
        return 1L;
    }

    public String extractRole(String token){
        return "USER";
    }
}
