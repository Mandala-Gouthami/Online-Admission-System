package com.sprint1.pack.service;

import java.util.List;

import com.sprint1.pack.model.Login;
import com.sprint1.pack.model.User;

public interface IUserService {
	public User addUserDetails(User user);
	public Login addLoginDetails(Login login);
	public List<User> getAllUserDetails();
	public User getUserDetailsById(String userId);
	public Login getLoginDetailsById(String userId);
	public User deleteUserDetailsById(String userId);
	public Login deleteLoginDetailsById(String Id);
	public Login changePassword(Login login);
	public Login resetPassword(Login login);
	public User updateUserDetails(User user);
	
	

}
