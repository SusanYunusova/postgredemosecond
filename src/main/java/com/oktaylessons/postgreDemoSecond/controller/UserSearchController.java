package com.oktaylessons.postgreDemoSecond.controller;

import com.oktaylessons.postgreDemoSecond.api.searchServices.ResponseSearchListUser;
import com.oktaylessons.postgreDemoSecond.api.searchServices.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchServices")
public class UserSearchController {
    @Autowired
    UserSearchService userSearchService;



    @GetMapping("/users")
    public ResponseEntity<ResponseSearchListUser> getAll(){


        return  new ResponseEntity<>(userSearchService.getAll(), HttpStatus.OK);
    }




}
