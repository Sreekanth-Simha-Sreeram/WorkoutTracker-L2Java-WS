package com.workout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.workout.dao.LoginDaoImpl;
import com.workout.model.User;

@RestController
public class LoginRestController {
	
	@Autowired 
    LoginDaoImpl logindao;
	
	@PostMapping(value = "/signUp")
	public ResponseEntity<?>signUp(@RequestBody User user) {
		return null;
		// TODO Auto-generated method stub
		
	}
 @PutMapping("{userName}/addTask/{userPassword}")
 public ResponseEntity<?> signIn(@PathVariable ("userName")String userName, @PathVariable ("userPassword")String userPassword) {
		// TODO Auto-generated method stub
		return null;
	}

 @PostMapping(value = "/forgotPassword/{userEmail}")
 public ResponseEntity<?> forgotPassword( @PathVariable ("useremail")String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}
 @PostMapping(value = "{newPassword}/resetPassword/{userName}")
 public ResponseEntity<?> resetPassword( @PathVariable ("newPassword")String newPassword,  @PathVariable ("userName")String userName) {
		// TODO Auto-generated method stub
		return null;
	}
@PutMapping("logout/{userId}")
 public ResponseEntity<?> logOut( @PathVariable ("userId")int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
