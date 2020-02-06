package com.bridgelabz.userapis.loginregistration.database;

import com.bridgelabz.userapis.loginregistration.model.Users;
import com.google.gson.JsonArray;
/**
 * 
 * @author Bikash Mohanty
 * @since 25th Jan 2020
 * @version 1.0
 *
 */
public interface IUserDao {

	boolean insertIntoUserApiTable(Users userInfo);

	JsonArray getAll();

	String getUserByName(String mail);

	String updateUsersByMail(String mail, Users users);

	String deleteUser(String mail);
	
	

}