package com.workout.model;

import java.sql.Time;
import java.util.Date;

public class WorkoutActive {
	int workoutId;
	Time startTime;
	Date startDate;
	Time endTime;
	Date endDate;
	String comment;
	boolean status;
	public int getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
