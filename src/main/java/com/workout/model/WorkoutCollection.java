package com.workout.model;

public class WorkoutCollection {
	String workoutTitle;
	String workoutNote;
	float caloriesBurntPerMinute;
	int categoryId;
	int workoutId;
	public String getWorkoutTitle() {
		return workoutTitle;
	}
	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}
	public String getWorkoutNote() {
		return workoutNote;
	}
	public void setWorkoutNote(String workoutNote) {
		this.workoutNote = workoutNote;
	}
	public float getCaloriesBurntPerMinute() {
		return caloriesBurntPerMinute;
	}
	public void setCaloriesBurntPerMinute(float caloriesBurntPerMinute) {
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}
}
