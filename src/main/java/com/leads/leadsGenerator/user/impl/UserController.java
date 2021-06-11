package com.leads.leadsGenerator.user.impl;

import java.util.concurrent.atomic.AtomicLong;

import com.leads.leadsGenerator.user.api.UserDTO;
import com.leads.leadsGenerator.user.api.UserService;
import com.leads.leadsGenerator.user.api.UserUrls;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Setter(onMethod_ = {@Autowired, @Qualifier("USER_SERVICE")})
    private UserService service;

    @GetMapping(UserUrls.GET_ALL)
    public UserDTO getUsers() {
        return service.getAllUsers();
    }

    @PostMapping(UserUrls.CREATE)
    @ResponseStatus(HttpStatus.CREATED)
    @Transactional
    public UserDTO postUser(@Valid @RequestBody UserDTO dto) {
        return service.saveUser(dto);
    }
}