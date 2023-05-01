package com.example.usermicroservice.service;

import com.example.usermicroservice.entities.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void createUser(UserDetail userDetail) {
        System.out.println("You have been successfully registered");
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/notification/send-notification", String.class);
                String results = response.getBody();
                 System.out.println();

    }
}
