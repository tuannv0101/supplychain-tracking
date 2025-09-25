package com.supplychain.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/e")
public class EmployeeController {

    @GetMapping("/dashboard")
    public String employeeDashboard() {
        return "Employee Dashboard - Bảng điều khiển nhân viên";
    }

    @GetMapping("/tasks")
    public String viewTasks() {
        return "Xem nhiệm vụ được giao";
    }

    @PostMapping("/update-task/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody String taskData) {
        return "Cập nhật nhiệm vụ ID " + id + ": " + taskData;
    }

    @GetMapping("/profile")
    public String viewProfile() {
        return "Xem thông tin cá nhân";
    }

    @PostMapping("/submit-report")
    public String submitReport(@RequestBody String reportData) {
        return "Nộp báo cáo: " + reportData;
    }
}
