package com.doctorsapplicationg4e12.repository.crudrepository;

import com.doctorsapplicationg4e12.model.MessageModel;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<MessageModel, Integer> {
}
