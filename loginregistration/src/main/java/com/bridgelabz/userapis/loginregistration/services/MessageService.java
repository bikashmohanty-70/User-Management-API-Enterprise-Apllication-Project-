package com.bridgelabz.userapis.loginregistration.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.userapis.loginregistration.model.Message;

public class MessageService 
{
	public List<Message> getAllMessages()
	{
		Message m1 = new Message(1l, "You have o come", "Bikash");
		Message m2 = new Message(2l, "Okay I will Try", "Sam");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
