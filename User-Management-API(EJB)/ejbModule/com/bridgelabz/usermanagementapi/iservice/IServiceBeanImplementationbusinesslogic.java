package com.bridgelabz.usermanagementapi.iservice;

import java.util.List;

import javax.ejb.Remote;

import com.bridgelabz.usermanagementapi.model.User;

/**
 * 
 * @author Bikash Mohanty
 * @since 4th Feb 2020
 * @version 1.0
 * 
 *          purpose: Session Bean Remote Interface is used for remote clients
 *          use the remote interface with pass-by-value semantics.
 *
 */
@Remote
public interface IServiceBeanImplementationbusinesslogic {
	// add or save User into the database
	public String addUser(User user);

	// Get all user Records
	public List<?> getTableData();

	// Get User data as per the email provided
	public User getUserData(String emailId);

	// delete user record as per the ID provided
	public String deleteUser(int id);

	// update user's record as per the id provided
	public String updateUser(int id, User upUser);

	// get all the users as a List according to the gender provided
	public List<?> getUsersByGender(String gender);

	public User getUsersListByAge();
}
