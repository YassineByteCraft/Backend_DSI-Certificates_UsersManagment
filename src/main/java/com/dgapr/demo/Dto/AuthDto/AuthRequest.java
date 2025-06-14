package com.dgapr.demo.Dto.AuthDto;
import jakarta.validation.constraints.NotBlank;


public record AuthRequest(
        @NotBlank(message = "Username must not be empty")
        String username,

        @NotBlank(message = "Password must not be empty")
        String password
) {}
