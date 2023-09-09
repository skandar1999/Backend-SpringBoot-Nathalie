package com.skandar.Etablissement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	private String username; 
	private String email ;
	private String password; 
	private String image ;
	private String role; 
	private String mobile ; 
	private boolean statue ;
	
	
	
	public User(String username, String email, String password, String image, String role, String mobile,
			boolean statue) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.image = image;
		this.role = role;
		this.mobile = mobile;
		this.statue = statue;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public boolean isStatue() {
		return statue;
	}
	public void setStatue(boolean statue) {
		this.statue = statue;
	}
	
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", image=" + image + ", role=" + role + ", mobile=" + mobile + ", statue=" + statue + "]";
	}
	

}
