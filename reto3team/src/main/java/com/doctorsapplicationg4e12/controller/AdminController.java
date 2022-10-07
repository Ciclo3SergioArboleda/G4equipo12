package com.doctorsapplicationg4e12.controller;

import com.doctorsapplicationg4e12.model.AdminModel;
import com.doctorsapplicationg4e12.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/all")
    public List<AdminModel> getAllAdmins(){return adminService.getAllAdmins();}
    @PostMapping("/save")
    public AdminModel saveAdmin(AdminModel adminModel){return adminService.saveAdmin(adminModel);}
}
