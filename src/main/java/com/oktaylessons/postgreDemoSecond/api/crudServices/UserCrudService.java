package com.oktaylessons.postgreDemoSecond.api.crudServices;

import com.oktaylessons.postgreDemoSecond.entity.User;
import com.oktaylessons.postgreDemoSecond.repository.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCrudService {
    @Autowired
    RepoUser repoUser;


    public  ResponseUser saveUser(SaveUserRequest saveUserRequest){
        ResponseUser responseUser = new ResponseUser();
        try {
            User user = new User();
            user.setBirthDate(saveUserRequest.getBirthDate());
            user.setLastName(saveUserRequest.getLastName());
            user.setName(saveUserRequest.getName());
            user = repoUser.save(user);


            //todo servercode message yazmadim responseentityle yazaramm deye

            responseUser.setUser(user);
        }catch (Exception e){
            System.out.println("exception save USER"+e);
        }
        return  responseUser;
    }

    public  ResponseUser updateUser(UpdateUserRequest updateUserRequest){
        ResponseUser responseUser = new ResponseUser();

        User upUser = repoUser.findById(updateUserRequest.getId());


        try {
            if (upUser!=null) {

                upUser.setBirthDate(updateUserRequest.getBirthDate());
                upUser.setLastName(updateUserRequest.getLastName());
                upUser.setName(updateUserRequest.getName());
                upUser = repoUser.save(upUser);

                // logger.info("saveUser response : {}", saveUserRequest.toString());

                //todo servercode message yazmadim responseentityle yazaramm deye

                responseUser.setUser(upUser);
            }else {
                System.out.println("not found");
            }
        }catch (Exception e){
            System.out.println("exception update USER"+e);
        }
        return  responseUser;
    }

//
//  public  ResponseUser deleteUSerById(int id){
//        ResponseUser responseUser = new ResponseUser();
//        try {
//            User user = repoUser.delete();
//        }
//  }
    
    
    
    
}
