package com.oktaylessons.postgreDemoSecond.api.controller;

import com.oktaylessons.postgreDemoSecond.api.dto.ResponseSearchListUser2;
import com.oktaylessons.postgreDemoSecond.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class UserControllerV2 {
    @Autowired
    UserService userService;



    @GetMapping("/users")
    public ResponseEntity<ResponseSearchListUser2> getAll2(){


        return  new ResponseEntity<>(userService.getAll2(), HttpStatus.OK);
    }


}
