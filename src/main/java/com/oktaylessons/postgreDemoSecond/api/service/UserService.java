package com.oktaylessons.postgreDemoSecond.api.service;

import com.oktaylessons.postgreDemoSecond.api.dto.ResponseSearchListUser;
import com.oktaylessons.postgreDemoSecond.api.dto.ResponseSearchListUser2;
import com.oktaylessons.postgreDemoSecond.api.model.SaveUserRequest;
import com.oktaylessons.postgreDemoSecond.api.model.UpdateUserRequest;
import com.oktaylessons.postgreDemoSecond.api.model.User;
import com.oktaylessons.postgreDemoSecond.api.repository.RepoUser;
import com.oktaylessons.postgreDemoSecond.api.dto.ResponseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    RepoUser repoUser;


    public ResponseUser saveUser(SaveUserRequest saveUserRequest) {
        ResponseUser responseUser = new ResponseUser();
        try {
            User user = new User();
            user.setBirthDate(saveUserRequest.getBirthDate());
            user.setLastName(saveUserRequest.getLastName());
            user.setName(saveUserRequest.getName());
            user = repoUser.save(user);


            //todo servercode message yazmadim responseentityle yazaramm deye

            responseUser.setUser(user);
        } catch (Exception e) {
            System.out.println("exception save USER" + e);
        }
        return responseUser;
    }

    public ResponseUser updateUser(UpdateUserRequest updateUserRequest) {
        ResponseUser responseUser = new ResponseUser();

        Optional<User> optionalUser = repoUser.findById(updateUserRequest.getId());


            try {
                if (optionalUser.isPresent()) {
                    User upUser = optionalUser.get();

                    upUser.setBirthDate(updateUserRequest.getBirthDate());
                    upUser.setLastName(updateUserRequest.getLastName());
                    upUser.setName(updateUserRequest.getName());
                    upUser = repoUser.save(upUser);

                    // logger.info("saveUser response : {}", saveUserRequest.toString());

                    //todo servercode message yazmadim responseentityle yazaramm deye

                    responseUser.setUser(upUser);
                } else {
                    System.out.println("not found");
                }
            } catch (Exception e) {
                System.out.println("exception update USER" + e);
            }

        return responseUser;
    }


  public  ResponseUser deleteUSerById(int id){
        ResponseUser responseUser = new ResponseUser();
        try {
            repoUser.deleteById(id);
        }catch (Exception e){

        }
        return  responseUser;
  }


    public ResponseSearchListUser getAll(){
        ResponseSearchListUser responseSearchListUser = new ResponseSearchListUser();

        List<User> userList= repoUser.findAll();
        if ((userList== null || userList.isEmpty())){
            responseSearchListUser.setUserList(null);
            responseSearchListUser.setServerMessage("User not found");
        }else {
            responseSearchListUser.setUserList(userList);
        }
        return responseSearchListUser;

    }
    public ResponseSearchListUser2 getAll2(){
        ResponseSearchListUser2 responseSearchListUser2  = new ResponseSearchListUser2();

        List<User> userList= repoUser.findAll();
        if ((userList== null || userList.isEmpty())){
            responseSearchListUser2.setUserList(null);

            responseSearchListUser2.setServerMessage("User not found");
        }else {
            responseSearchListUser2.setUserList(userList);
            responseSearchListUser2.setStatus("succeded");
        }
        return responseSearchListUser2;

    }







}
