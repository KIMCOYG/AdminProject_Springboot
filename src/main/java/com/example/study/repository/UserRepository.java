package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //기본적인 CRUD
public interface UserRepository extends JpaRepository<User, Long> { //엔티티와 식별자 ID

    //select * from user where account = ? <<test03, test04
//    Optional<User> findByAccount(String account);

//    Optional<User> findByEmail(String email);

    //select * from user where account = ? and email = ?
//    Optional<User> findByAccountAndEmail(String account, String email);

    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);
}