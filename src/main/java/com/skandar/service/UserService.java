package com.skandar.service;

import java.util.List;

import com.skandar.Nathalie.model.User;


public interface UserService {

    User saveUser(User user); 
    User updateUser(Long idUser, String username, String email, String password, String image, String role, String mobile, boolean statue);
    void deleteUser(User user);
    void deleteUserById(Long id);
    User getUser(Long id); 
	List<User> getAllUsers();
}
