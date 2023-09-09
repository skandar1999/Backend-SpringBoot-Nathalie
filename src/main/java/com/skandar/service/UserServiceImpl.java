package com.skandar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skandar.Nathalie.model.User;
import com.skandar.Nathalie.repos.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository ;

	public User saveUser(User user) {
		return userRepository.save(user) ;
	}
	

	public User updateUser(Long idUser, String username, String email, String password, String image, String role, String mobile, boolean statue) {
	    int updatedRows = userRepository.updateUserById(idUser, username, email, password, image, role, mobile, statue);
	    
	    if (updatedRows > 0) {
	        // The user was successfully updated, you can load and return the updated user
	        return userRepository.findById(idUser).orElse(null);
	    } else {
	        // Handle the case where the user wasn't found or the update failed
	        return null;
	    }
	}


	
	public void deleteUser(User user) {
		 userRepository.delete(user) ;
		
	}

	
	public void deleteUserById(Long id) {
		 userRepository.deleteById(id) ;
		
	}

	
	public User getUser(Long id) {
		return userRepository.findById(id).get() ;
	}

	
	public List<User> getAllUsers() {
		return userRepository.findAll() ;
	}

}
