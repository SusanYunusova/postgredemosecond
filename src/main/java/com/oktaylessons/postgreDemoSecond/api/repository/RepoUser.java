package com.oktaylessons.postgreDemoSecond.api.repository;

import com.oktaylessons.postgreDemoSecond.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepoUser extends JpaRepository<User,Integer> {


}
