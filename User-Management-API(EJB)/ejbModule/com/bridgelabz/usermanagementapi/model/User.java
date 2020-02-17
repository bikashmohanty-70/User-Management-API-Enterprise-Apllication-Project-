package com.bridgelabz.usermanagementapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author Bikash Mohanty
 * @since 4th Feb 2020
 * @version 1.0
 * 
 * @purpose: User Model class.
 * 			 It maintains the data of the application. 
 * 			 Model objects retrieve and store model state in the persistance store like a database.
 * 			 Model class holds data in public properties.
 *
 */

@Entity(name = "USER_MANAGEMENT_API")	// This is a marker annotation which indicates that this class is an entity. 
										// This annotation must be placed on the class name.

/*
 * Serializable is a marker interface (has no data member and method). It is
 * used to "mark" Java classes so that the objects of these classes may get a
 * certain capability. Therefore, a class implementing Serializable does not
 * have to implement any specific methods. Implementing Serializable thus just
 * tells the Java serialization classes that this class is intended for object
 * serialization.
 */
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/*
	 * This annotation is placed on a specific field that holds the persistent
	 * identifying properties. This field is treated as a primary key in database.
	 */
	
	@Id
	
	/*
	 * Annotation "@Column" is used to specify the mapped column for a persistent
	 * property or field. If no Column annotation is specified, the default values
	 * apply.
	 * 
	 * If an instance variable name matches the column name in the table then there
	 * is no need to specify the "@Column" annotation.
	 */
	
	@Column(name = "ID")
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String password;
	private String dob;
	private String gender;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private long contact;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
}
