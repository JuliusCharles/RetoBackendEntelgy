package com.entelgy.retobackend.controller;

import com.entelgy.retobackend.model.Response;
import com.entelgy.retobackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RetoBackendController {

    @Autowired
    private UserService userService;

    @PostMapping("/retoBackend")
    public Response retoBackend(){
        return userService.response();
    }
}
