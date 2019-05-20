package com.oktaylessons.postgreDemoSecond.api.controller;

import com.oktaylessons.postgreDemoSecond.api.dto.ResponseSearchListUser;
import com.oktaylessons.postgreDemoSecond.api.dto.ResponseUser;
import com.oktaylessons.postgreDemoSecond.api.model.SaveUserRequest;
import com.oktaylessons.postgreDemoSecond.api.model.UpdateUserRequest;
import com.oktaylessons.postgreDemoSecond.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping(value = "/users")
    public ResponseEntity<ResponseUser>  saveUser(@RequestBody SaveUserRequest saveUserRequest){
        return new ResponseEntity<>(userService.saveUser(saveUserRequest), HttpStatus.CREATED);
    }

    @PutMapping("/users")
    public ResponseUser updateUser(@RequestBody UpdateUserRequest updateUserRequest){
        return  userService.updateUser(updateUserRequest);
    }

    @DeleteMapping("/users/{id}")
    public  ResponseUser deleteUSerById(@PathVariable("id") int id){
        return  userService.deleteUSerById(id);
    }



    @GetMapping(value = "/users")
    public ResponseEntity<ResponseSearchListUser> getAll(){


        return  new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

}
