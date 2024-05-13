package com.lecuong.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<String> getUserInfoAdmin() {
        return ResponseEntity.ok("admin");
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<String> getUserInfoUser() {
        return ResponseEntity.ok("user");
    }
}
