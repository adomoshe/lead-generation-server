package com.leads.leadsGenerator.user.impl;

import java.util.concurrent.atomic.AtomicLong;

import com.leads.leadsGenerator.user.api.UserDTO;
import com.leads.leadsGenerator.user.api.UserService;
import com.leads.leadsGenerator.user.api.UserUrls;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    private UserService service;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user")
    public UserDTO getUsers(@RequestParam(value = "name", defaultValue = "World") String name) {
        return null;
    }

    @PostMapping(UserUrls.CREATE)
    @ResponseStatus(HttpStatus.CREATED)
    @Transactional
    public UserDTO postUser(@Valid @RequestBody UserDTO dto) {
        return service.saveUser(dto);
    }
}