package com.doctorsapplicationg4e12.repository;

import com.doctorsapplicationg4e12.model.AdminModel;
import com.doctorsapplicationg4e12.repository.crudrepository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<AdminModel> getAllAdmins(){
        return (List<AdminModel>) adminCrudRepository.findAll();
    }
    public AdminModel saveAdmin(AdminModel adminModel){
        return adminCrudRepository.save(adminModel);
    }
    //Ni idea de como hacerlo sin el id so esto es lo que hay - Mateo c:

   // public boolean deleteAdmin(Integer id){
   //     Optional<AdminModel> admin = adminCrudRepository.findById(id);
   //     if (admin.isPresent()){
   //         admin.get().setStatus(false);
   //     }
   //     return true;
   // }


    //public Optional<AdminModel> getAdmin(String name){
    //  return adminCrudRepository.findById();
    //}
}
