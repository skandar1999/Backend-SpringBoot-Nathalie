package com.skandar.Etablissement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skandar.Etablissement.model.User;
import com.skandar.service.UserService;

@RestController
@RequestMapping("/api") 
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getallusers") 
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
    
        
        @GetMapping("/getById/{id}")
        public User getUserById(@PathVariable("id") Long id) {
            return userService.getUser(id);
        }
        
        
        @RequestMapping("/userCreate")
        public User createProduit(@RequestBody User user) {
        return userService.saveUser(user);
        }
        	
        
        @PutMapping("/updateUser/{id}")
        public User updateUser(@PathVariable("id") Long id, @RequestBody User updatedUser) {
            // Set the user's ID to match the path variable
            updatedUser.setIdUser(id);
            return userService.saveUser(updatedUser);
        }
        
        
        @RequestMapping("/deleteUser/{id}")
        public void deleteUser(@PathVariable("id") Long id)
        {
        	userService.deleteUserById(id);
        }



    
}
