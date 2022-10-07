package com.doctorsapplicationg4e12.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="doctor")

public class DoctorModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String specialty;
    private Integer graduate_year;
    private Integer department_id;
    private String name;

    public DoctorModel() {
    }

    public DoctorModel(String specialty, Integer graduate_year, Integer department_id, String name) {
        this.specialty = specialty;
        this.graduate_year = graduate_year;
        this.department_id = department_id;
        this.name = name;
    }

    public DoctorModel(Integer id, String specialty, Integer graduate_year, Integer department_id, String name) {
        this.id = id;
        this.specialty = specialty;
        this.graduate_year = graduate_year;
        this.department_id = department_id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getGraduate_year() {
        return graduate_year;
    }

    public void setGraduate_year(Integer graduate_year) {
        this.graduate_year = graduate_year;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoctorModel{" +
                "id=" + id +
                ", specialty='" + specialty + '\'' +
                ", graduate_year=" + graduate_year +
                ", department_id=" + department_id +
                ", name='" + name + '\'' +
                '}';
    }
}
