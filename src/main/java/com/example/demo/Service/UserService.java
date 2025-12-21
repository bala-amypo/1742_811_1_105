package com.example.demo.Service;

import com.example.demo.Dto.*;

public interface UserService {
    void register(RegisterRequest request);
    AuthResponse login(AuthRequest request);
}
