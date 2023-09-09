package com.skandar.Nathalie;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skandar.Nathalie.UserNotFoundException;
import com.skandar.Nathalie.model.User;
import com.skandar.Nathalie.repos.UserRepository;

@SpringBootTest
class NathalieApplicationTests {

	 @Autowired
	    private UserRepository userRepository;

	    @Test
	    public void testCreateUser() {
	        User user = new User();
	        user.setUsername("skandar.skandar");
	        user.setEmail("sabriskandar4@gmail.com");
	        user.setPassword("azertyuiop");
	        user.setImage("user.jpg");
	        user.setRole("user");
	        user.setMobile("0000000");
	        user.setStatue(false);

	        userRepository.save(user);
	    }
	    
	    @Test
	    public void testUpdateUser() {
	        // Retrieve the user by their ID
	        User u = userRepository.findById(1L).orElse(null); // Use 'orElse(null)' for safety

	        if (u != null) {
	            // Update the user's status
	            u.setPassword("aaaa"); // Assuming 'setStatue' method is correctly defined

	            // Save the updated user
	            userRepository.save(u);
	        } else {
	            // Handle the case where the user with ID 1 doesn't exist
	            throw new UserNotFoundException("User with ID 1 not found");
	        }
	    }
	    
	    @Test
	    public void testListerTousUsers() {
	        List<User> users = userRepository.findAll();

	        for (User u : users) {
	            System.out.println(u);
	          
	        }
	    }	
	    
	    
	    


}
