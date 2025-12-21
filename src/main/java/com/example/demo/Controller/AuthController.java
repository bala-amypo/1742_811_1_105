package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.Dto.AuthRequest;
import com.example.demo.Dto.AuthResponse;
import com.example.demo.Dto.RegisterRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        userService.register(request);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return userService.login(request);
    }
}
