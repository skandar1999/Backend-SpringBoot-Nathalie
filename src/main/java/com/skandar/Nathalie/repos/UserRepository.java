package com.skandar.Nathalie.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skandar.Nathalie.model.User;

public interface UserRepository extends JpaRepository<User, Long > {

	  @Modifying
	    @Query("UPDATE User u " +
	           "SET u.username = :username, " +
	           "    u.email = :email, " +
	           "    u.password = :password, " +
	           "    u.image = :image, " +
	           "    u.role = :role, " +
	           "    u.mobile = :mobile, " +
	           "    u.statue = :statue " +
	           "WHERE u.idUser = :idUser")
	    int updateUserById(
	        @Param("idUser") Long idUser,
	        @Param("username") String username,
	        @Param("email") String email,
	        @Param("password") String password,
	        @Param("image") String image,
	        @Param("role") String role,
	        @Param("mobile") String mobile,
	        @Param("statue") boolean statue
	    );
	}
