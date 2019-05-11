package com.oktaylessons.postgreDemoSecond.api.searchServices;


import com.oktaylessons.postgreDemoSecond.entity.User;
import com.oktaylessons.postgreDemoSecond.repository.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserSearchService {
    @Autowired
    RepoUser repoUser;

    public  ResponseSearchListUser getAll(){
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

}
