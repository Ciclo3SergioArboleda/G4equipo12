package com.doctorsapplicationg4e12.controller;

import com.doctorsapplicationg4e12.model.MessageModel;
import com.doctorsapplicationg4e12.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> getAllMessages() {
        return messageService.getAllMessages();
    }
    @GetMapping("/{id}")
    public Optional<MessageModel> getMessage(@PathVariable Integer id){
        return messageService.getMessage(id);
    }
    @PostMapping("/save")
    public MessageModel saveMessage(@RequestBody MessageModel messageModel){
        return messageService.saveMessage(messageModel);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteMessage(@PathVariable Integer id){
        return messageService.deleteMessage(id);
    }
    @PutMapping("/update")
    public MessageModel updateMessage(@RequestBody MessageModel messageModel){
        return messageService.updateMessage(messageModel);
    }
}
