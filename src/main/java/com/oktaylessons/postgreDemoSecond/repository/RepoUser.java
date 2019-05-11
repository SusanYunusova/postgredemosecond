package com.oktaylessons.postgreDemoSecond.repository;

import com.oktaylessons.postgreDemoSecond.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoUser extends CrudRepository<User,Long> {
    List<User> findAll();

    User findById(int id);

    List<User> findAllByNameAndLastName();

    List<User> findAllByName();

    List<User> findAllByBirthDate();


}
