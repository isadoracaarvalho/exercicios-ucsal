package org.example.helloworld.controller;

import org.example.helloworld.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projeto")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.ok(usersRepository.findAll());
    }
}
