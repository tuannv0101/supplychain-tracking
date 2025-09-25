package com.supplychain.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/m")
public class ManagerController {

    @GetMapping("/dashboard")
    public String managerDashboard() {
        return "Manager Dashboard - Quản lý nhân viên";
    }

    @GetMapping("/reports")
    public String viewReports() {
        return "Xem báo cáo";
    }

    @GetMapping("/team")
    public String manageTeam() {
        return "Quản lý nhóm";
    }

    @PostMapping("/assign-task")
    public String assignTask(@RequestBody String taskData) {
        return "Phân công nhiệm vụ: " + taskData;
    }

    @GetMapping("/performance")
    public String viewPerformance() {
        return "Xem hiệu suất làm việc";
    }
}
