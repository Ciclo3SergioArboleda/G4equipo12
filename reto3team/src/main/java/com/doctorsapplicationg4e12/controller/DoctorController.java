package com.doctorsapplicationg4e12.controller;

import com.doctorsapplicationg4e12.model.DoctorModel;
import com.doctorsapplicationg4e12.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/Doctor")
@CrossOrigin(origins = "*")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @GetMapping("/all")
    public List<DoctorModel> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Optional<DoctorModel> getDoctor(@PathVariable Integer id){
        return doctorService.getDoctor(id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteDoctor(@PathVariable Integer id){
        return doctorService.deleteDoctor(id);
    }

    @PutMapping("/update")
    public DoctorModel updateDoctor(@RequestBody DoctorModel doctorModel){
        return doctorService.updateDoctor(doctorModel);
    }

    @PostMapping("/save")
    public DoctorModel saveDoctor(@RequestBody DoctorModel doctorModel){
        return doctorService.saveDoctor(doctorModel);
    }

}
