package com.bridgelabz.usermanagementapi.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONArray;

import com.bridgelabz.usermanagementapi.iservice.IServiceBeanImplementationbusinesslogic;
import com.bridgelabz.usermanagementapi.model.User;

/**
 * 
 * @author Bikash Mohanty
 * @since 4th Feb 2020
 * @version 1.0
 * 
 *          purpose: This controller class is responsible for processing
 *          incoming requests. It invokes business logic, updates the model and
 *          returns the view that should be rendered.
 * 
 *          This is a Session Bean Controller class. SessionBean: A session bean
 *          performs operations for the client.
 *
 */

/*
 * The "@Path" annotation is used to specify the URI through which a resource
 * and an API can be accessed. Resource in this case is the REST Web service
 * itself. Thus this annotation is present at the class level as well as the
 * method level. It is mandatory to annotate a REST Web resource class with the
 * "@Path" annotation.
 */

@Path("user")

/*
 * A stateless session bean is a type of enterprise bean, which is normally used
 * to perform independent operations. A stateless session bean as per its name
 * does not have any associated client state, but it may preserve its instance
 * state.
 */

@Stateless

public class UserController
{

	public UserController() 
	{
		// constructor
	}

	/*
	 * EJB beans are specifically designed to implement the business logic of your
	 * application. As such they provide services that are often needed when
	 * implementing such logic, such as transactions, injecting of the entity
	 * manager (used for JPA, the Java Persistence API) and pooling of beans.
	 * 
	 * @GET: 	HTTP GET. Use GET requests to retrieve resource
	 * 			representation/information only – and not to modify it in any way.
	 * 
	 * @POST: 	The POST method is used to request that the origin server accept the
	 * 			entity enclosed in the request as a new subordinate of the resource
	 * 			identified by the Request-URI in the Request-Line.
	 * 
	 * @Consumes: 	The @Consumes annotation is used to specify which MIME media types
	 * 				of representations a resource can accept, or consume, from the client.
	 * 
	 * @Produces: 	The @Produces annotation is used to specify the MIME media types
	 * 				or representations a resource can produce and send back to the client.
	 */
	@EJB
	private IServiceBeanImplementationbusinesslogic serviceInterf; // private Remote Bean Implementation. See ReadMe.txt
																   // for more details.
	
	/**
	 * Returns a plain text about the status of user record.
	 * 
	 * @param user is the model class object which accepts the data in JSON format.
	 * @return status of the insertion of record.
	 */
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.TEXT_PLAIN)
	
	public String saveUser(User user) 
	{
		return serviceInterf.addUser(user);
	}
	
	/**
	 * Fetch all user's record and Return all the available users in the database to
	 * the client in JSONARRAY format.
	 * 
	 * @return list of the Users as a JSONARRAY object
	 */
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONArray getAllUsers()
	{
		JSONArray userJSONArrayObj = new JSONArray();
		List<?> usersList = serviceInterf.getTableData();
		for(Object users : usersList)
		{
			userJSONArrayObj.add(users);
		}
		return userJSONArrayObj;
	}
	
	/**
	 * getUser() will get user data from table given that email passed from the url
	 * must be present in database
	 * 
	 * @param mail String type
	 * @return user Object in JSONOBJECT FORMAT
	 */
	
	@GET
	@Path("/getUser")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@QueryParam("email") String mail)
	{
		return serviceInterf.getUserData(mail);		
	}
	
	
	/**
	 * The following method is responsible for deleting a User Record from the
	 * database by their id.
	 * 
	 * @param id is of type "int", which accepts the value from the URI.
	 * @return the status of the user record in a string.
	 */
	
	@DELETE	// Indicates that the annotated method responds to HTTP DELETE requests.
	@Path("/deleteUser")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteUser(@QueryParam("id") int id)
	{
		return serviceInterf.deleteUser(id);	
	}
	
	/**
	 * The following method is responsible for updating user's record according to
	 * the ID provided by the CLIENT
	 * 
	 * @param id        "Int" type QueryParam which is the condition for updating
	 *                  record.
	 * @param firstname
	 * @param lastname
	 * @param username
	 * @param mail
	 * @param pwd
	 * @param dob
	 * @param gender
	 * @param city
	 * @param state
	 * @param country
	 * @param pin
	 * @param number
	 * @return
	 */
	
	@PUT
	@Path("/updateUser")
	@Produces(MediaType.APPLICATION_JSON)
	public String updateUser(@QueryParam("id") int id, 
			@FormParam ("fname") String firstname,
			@FormParam ("lname") String lastname,
			@FormParam ("uname") String username,
			@FormParam ("email") String mail,
			@FormParam ("password") String pwd,
			@FormParam ("dob") String dob,
			@FormParam ("gender") String gender,
			@FormParam ("city") String city,
			@FormParam ("state") String state,
			@FormParam ("country") String country,
			@FormParam ("pincode") String pin,
			@FormParam ("contact") long number)
	{
		User upUser = new User();
		upUser.setFirstname(firstname);
		upUser.setLastname(lastname);
		upUser.setUsername(username);
		upUser.setEmail(mail);
		upUser.setPassword(pwd);
		upUser.setDob(dob);
		upUser.setGender(gender);
		upUser.setCity(city);
		upUser.setState(state);
		upUser.setCountry(country);
		upUser.setPincode(pin);
		upUser.setContact(number);
		
		return serviceInterf.updateUser(id, upUser);
	}
	
	/**
	 * The Following Method is Responsible for fetching all user records gender wise.
	 * 
	 * @param gender String Type, which must be passed throug the URI
	 * @return List of JSONObjects having User's Data
	 */
	
	@GET
	@Path("getUser/genderWise")
	@Produces(MediaType.APPLICATION_JSON)
	public List<?> getUsersByGender(@QueryParam("gender") String gender)
	{
		return serviceInterf.getUsersByGender(gender);
		
	}
	
	@GET
	@Path("/byAge")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUsersListByAge()
	{
		return serviceInterf.getUsersListByAge();
	}
}

