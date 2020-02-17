package com.bridgelabz.usermanagementapi.serviceimplementationbusinesslogic;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.jboss.resteasy.logging.Logger;

import com.bridgelabz.usermanagementapi.iservice.IServiceBeanImplementationbusinesslogic;
import com.bridgelabz.usermanagementapi.model.User;


@Stateless
public class ServiceBeanImplementationbusinesslogic implements IServiceBeanImplementationbusinesslogic 
{
	@PersistenceContext(unitName = "JPADB")
	private EntityManager entityManager;
	
	Logger log = Logger.getLogger(ServiceBeanImplementationbusinesslogic.class);

	public ServiceBeanImplementationbusinesslogic() 
	{ 
		//Constructor
	}


	@Override
	public String addUser(User user) {
		entityManager.persist(user);
		return "All ok";
	}


	@Override
	public List<?> getTableData() 
	{
		String getAllDataQuery = "SELECT p from " + User.class.getName() + " p";
		Query query = entityManager.createQuery(getAllDataQuery);
		return query.getResultList();
	}


	@Override
	public User getUserData(String emailId) 
	{
		TypedQuery<User> query = entityManager.createQuery("SELECT c FROM USER_MANAGEMENT_API c WHERE c.email = :email",
				User.class);
		return query.setParameter("email", emailId).getSingleResult();
	}


	@Override
	public String deleteUser(int id) 
	{
		try 
		{
			Query query = entityManager.createNativeQuery("DELETE FROM USER_MANAGEMENT_API WHERE ID = " + id);
			query.executeUpdate();
			return "user deleted";
		}
		catch (Exception e) 
		{
			return "Error while Deleting "+e;
		}
	}


	@Override
	public String updateUser(int id, User upUser) 
	{				
		try 
		{
			User user = entityManager.find(User.class, id);

			user.setFirstname(upUser.getFirstname());
			user.setLastname(upUser.getLastname());
			user.setUsername(upUser.getUsername());
			user.setEmail(upUser.getEmail());
			user.setPassword(upUser.getPassword());
			user.setDob(upUser.getDob());
			user.setGender(upUser.getGender());
			user.setCity(upUser.getCity());
			user.setState(upUser.getState());
			user.setCountry(upUser.getCountry());
			user.setPincode(upUser.getPincode());
			user.setContact(upUser.getContact());

			entityManager.persist(user);
			return "SuccessFully Updated...";
		} 
		catch (Exception e) 
		{
			log.info("Error Modifying Data: "+e);
			return "Could't Update. Check Log FIle..";
		}
		
	}


	@Override
	public List<?> getUsersByGender(String gender) 
	{
		TypedQuery<User> query = entityManager.createQuery("SELECT c FROM USER_MANAGEMENT_API c WHERE c.gender =:gender",User.class);
		return query.setParameter("gender", gender).getResultList();
	}


	@Override
	public User getUsersListByAge() 
	{
		
		return null;
	}

}
