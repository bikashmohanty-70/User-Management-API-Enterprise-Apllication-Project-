package com.bridgelabz.usermanagementapi.iservice;

import java.util.List;

import javax.ejb.Remote;

import com.bridgelabz.usermanagementapi.model.User;

@Remote
public interface IServiceBeanImplementationbusinesslogic 
{
	public String addUser(User user);

	public List<?> getTableData();

	User getUserData(String emailId);

	public String deleteUser(int id);

	public String updateUser(int id, User upUser);

	public List<?> getUsersByGender(String gender);

	public User getUsersListByAge();
}
