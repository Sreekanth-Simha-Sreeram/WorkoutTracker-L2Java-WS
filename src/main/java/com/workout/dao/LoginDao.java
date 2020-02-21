package com.workout.dao;

import com.workout.model.User;

public interface LoginDao {
	public void signUp(User user);
	public boolean signIn(String userName, String password);
	public void forgotPassword(String userEmail);
	public void resetPassword(String newPassword, String username);
	public void logOut(int userId);

}
