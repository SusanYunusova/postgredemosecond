package com.oktaylessons.postgreDemoSecond.controller;

import com.oktaylessons.postgreDemoSecond.api.crudServices.ResponseUser;
import com.oktaylessons.postgreDemoSecond.api.crudServices.SaveUserRequest;
import com.oktaylessons.postgreDemoSecond.api.crudServices.UpdateUserRequest;
import com.oktaylessons.postgreDemoSecond.api.crudServices.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crudServices")
public class UserCrudController {
    @Autowired
    UserCrudService userCrudService;


    @PostMapping("/users")
    public  ResponseUser saveUser(@RequestBody SaveUserRequest saveUserRequest){
        return  userCrudService.saveUser(saveUserRequest);
    }

    @PutMapping("/users")
    public ResponseUser updateUser(@RequestBody UpdateUserRequest updateUserRequest){
        return  userCrudService.updateUser(updateUserRequest);
    }


}
