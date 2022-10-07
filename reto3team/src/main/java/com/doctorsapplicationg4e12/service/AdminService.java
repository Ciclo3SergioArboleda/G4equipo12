package com.doctorsapplicationg4e12.service;

import com.doctorsapplicationg4e12.model.AdminModel;
import com.doctorsapplicationg4e12.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public List<AdminModel> getAllAdmins(){
        return (List<AdminModel>) adminRepository.getAllAdmins();
    }
    public AdminModel saveAdmin(AdminModel adminModel){
        return adminRepository.saveAdmin(adminModel);
    }
}
