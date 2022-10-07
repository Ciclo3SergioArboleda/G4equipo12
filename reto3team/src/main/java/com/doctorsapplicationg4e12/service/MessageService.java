package com.doctorsapplicationg4e12.service;

import com.doctorsapplicationg4e12.model.MessageModel;
import com.doctorsapplicationg4e12.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<MessageModel> getAllMessages(){
        return (List<MessageModel>) messageRepository.getAllMessages();
    }
    public Optional<MessageModel> getMessage(Integer id){
        return messageRepository.getMessage(id);
    }
    public MessageModel saveMessage(MessageModel messageModel){
        return messageRepository.saveMessage(messageModel);
    }
    public boolean deleteMessage(Integer id){
        messageRepository.deleteMessage(id);
        return true;
    }
    public MessageModel updateMessage(MessageModel messageModel){
        return messageRepository.saveMessage(messageModel);
    }
}
