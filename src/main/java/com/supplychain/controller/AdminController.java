package com.supplychain.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/a")
public class AdminController {

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "Admin Dashboard - Quản lý hệ thống";
    }

    @GetMapping("/users")
    public String manageUsers() {
        return "Quản lý người dùng";
    }

    @GetMapping("/settings")
    public String systemSettings() {
        return "Cài đặt hệ thống";
    }

    @PostMapping("/create-user")
    public String createUser(@RequestBody String userData) {
        return "Tạo người dùng mới: " + userData;
    }

    @DeleteMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Xóa người dùng với ID: " + id;
    }
}
