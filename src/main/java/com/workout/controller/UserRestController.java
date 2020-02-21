package com.workout.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workout.dao.UserDaoImpl;
import com.workout.model.WorkoutCategory;
import com.workout.model.WorkoutCollection;

@RestController
public class UserRestController {
	@Autowired 
	UserDaoImpl userdao;
	
	@PostMapping(value = "/addWorkout")
	public ResponseEntity<?>addWorkout(@RequestBody WorkoutCollection workoutCollection) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@PutMapping("editWorkout/{workoutId}")
	public ResponseEntity<?> editWorkout(@PathVariable ("workoutId")int workoutId) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@PutMapping("deleteWorkout/{workoutId}")
	public ResponseEntity<?> deleteWorkout(@PathVariable ("workoutId")int workoutId) {
		return null;
		// TODO Auto-generated method stub
		
	}
    @GetMapping("viewWorkout/{userId}")
	public ResponseEntity<?> viewWorkout(@PathVariable ("userId")int userId) {
		// TODO Auto-generated method stub
		return null;
	}
    
    @PostMapping(value="addCategory")
    public ResponseEntity<?> addCategory(@RequestBody WorkoutCategory workoutCategory) {
		return null;
		// TODO Auto-generated method stub
		
	}
    @PostMapping(value="editCategory")
    public ResponseEntity<?> editCategory(@PathVariable ("categoryId")int categoryId) {
		return null;
		// TODO Auto-generated method stub
		
	}
@PutMapping("deleteCategory/{categoryId}")
    public ResponseEntity<?> deleteCategory(@PathVariable ("categoryId")int categoryId) {
		return null;
		// TODO Auto-generated method stub
		
	}
@GetMapping("viewCategory/{userId}")
    public ResponseEntity<?> viewCategory(@PathVariable ("userId")int userId) {
		// TODO Auto-generated method stub
		return null;
	}

@PutMapping("{userId}/startWorkout/{categoryId}")
    public ResponseEntity<?>startWorkout(@PathVariable ("workoutId")int workoutId,@PathVariable ("userId") int userId) {
		return null;
		// TODO Auto-generated method stub
		
	}
@PutMapping("{userId}/endWorkout/{workoutId}")
public ResponseEntity<?> endWorkout(@PathVariable ("workoutId")int workoutId,@PathVariable ("userId") int userId) {
	return null;
		// TODO Auto-generated method stub
		
	}
@GetMapping("{startDate}/generateReport/{endDate}")
public ResponseEntity<?> generateReport(@PathVariable ("startDate")Date startDate,@PathVariable ("endDate") Date endDate) {
	return null;
		// TODO Auto-generated method stub
		
	}

}
