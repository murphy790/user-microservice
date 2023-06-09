package com.example.usermicroservice.controller;

import com.example.usermicroservice.entities.UserDetail;
import com.example.usermicroservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody UserDetail user) {
      userService.createUser(user);
      return ResponseEntity.ok("Success");
    }
}
