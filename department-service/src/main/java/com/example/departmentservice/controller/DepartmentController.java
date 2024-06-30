package com.example.departmentservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CuongLM
 * @created 30/06/2024 - 20:52
 * @project microservice-keycloak-v2
 */
@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<String> getDepartmentInfoAdmin() {
        return ResponseEntity.ok("department admin");
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<String> getDepartmentInfoUser() {
        return ResponseEntity.ok("department user");
    }
}
