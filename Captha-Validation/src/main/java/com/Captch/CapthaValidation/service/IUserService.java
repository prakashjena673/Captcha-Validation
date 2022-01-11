package com.Captch.CapthaValidation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Captch.CapthaValidation.model.User;

public interface IUserService {

	void createUser(User user);

	List<User> getAllUsers();

	Optional<User> getOneUser(Integer Id);

}
