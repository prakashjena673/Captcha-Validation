package com.Captch.CapthaValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Captch.CapthaValidation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
