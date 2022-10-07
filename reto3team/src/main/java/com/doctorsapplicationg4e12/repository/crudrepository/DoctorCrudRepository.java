package com.doctorsapplicationg4e12.repository.crudrepository;

import com.doctorsapplicationg4e12.model.DoctorModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<DoctorModel, Integer> {
}
