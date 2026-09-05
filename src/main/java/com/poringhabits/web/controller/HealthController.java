package com.poringhabits.web.controller;

import com.poringhabits.model.repository.UserRepository;
import com.poringhabits.web.response.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    private final UserRepository userRepository;

    public HealthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<HealthResponse> checkHealth() {
        userRepository.count();
        HealthResponse response = new HealthResponse(
            "UP",
            System.currentTimeMillis(),
            "poring-habits-backend",
                "connected"
        );
        return ResponseEntity.ok(response);
    }
}
