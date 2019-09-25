package com.example.springbootwebsocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @MessageMapping("/user")
    @SendTo("/topic/user")
    public com.example.springbootwebsocketdemo.model.UserResponse getUser (com.example.springbootwebsocketdemo.model.User user) {
        return new com.example.springbootwebsocketdemo.model.UserResponse("Hello " + user.getName());
    }
}
