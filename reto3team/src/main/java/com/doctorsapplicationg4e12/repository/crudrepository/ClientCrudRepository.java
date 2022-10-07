package com.doctorsapplicationg4e12.repository.crudrepository;

import com.doctorsapplicationg4e12.model.ClientModel;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<ClientModel, Integer> {
}
