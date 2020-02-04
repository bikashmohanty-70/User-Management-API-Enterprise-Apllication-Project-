package com.bridgelabz.userapis.loginregistration.database;

import java.util.List;

import com.bridgelabz.userapis.loginregistration.model.Users;
import com.google.gson.JsonArray;

public interface IUserDao {

	boolean insertIntoUserApiTable(Users userInfo);

	boolean updateUserApiTable();

	boolean deleteRecordsInUserApiTable();

	JsonArray getAll();
	
	

}