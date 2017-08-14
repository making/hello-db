package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {
    private final MessageMapper messageMapper;

    public MessagesController(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @GetMapping("messages")
    public List<Message> getMessages() {
        return messageMapper.findAll();
    }

    @PostMapping("messages")
    public Message postMessages(@RequestBody Message message) {
        messageMapper.create(message);
        return message;
    }
}
