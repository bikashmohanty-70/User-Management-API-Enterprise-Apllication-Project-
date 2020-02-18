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

/**
 * 
 * @author Bikash Mohanty
 * @since 4th Feb 2020
 * @version 1.0
 * 
 *          purpose: EJB Session bean Implementation class for Business Logics.
 *
 */

@Stateless
public class ServiceBeanImplementationbusinesslogic implements IServiceBeanImplementationbusinesslogic {
	/*
	 * A persistence context handles a set of entities which hold data to be
	 * persisted in some persistence store (e.g. a database).
	 * 
	 * the context is aware of the different states an entity can have (e.g.
	 * managed, detached) in relation to both the context and the underlying
	 * persistence store.
	 */
	@PersistenceContext(unitName = "JPADB")
	private EntityManager entityManager; // Interface used to interact with the persistence context.
											// Entities are managed by javax.persistence.EntityManager instance using
											// persistence context.

	Logger log = Logger.getLogger(ServiceBeanImplementationbusinesslogic.class);

	public ServiceBeanImplementationbusinesslogic() {
		// Constructor
	}

	// Save or Add user in the database
	@Override
	public String addUser(User user) {
		entityManager.persist(user); // Make an instance managed and persistent.
										// Parameters: entity - entity instance
		return "All ok";
	}

	// Read user Data from the database.
	@Override
	public List<?> getTableData() {
		/*
		 * Java Persistence Query Language (JPQL) defined in JPA specification. It is
		 * used to create queries against entities to store in a relational database.
		 */
		String getAllDataQuery = "SELECT p from " + User.class.getName() + " p";
		Query query = entityManager.createQuery(getAllDataQuery); // javax.persistence.Querry Interface used to control
																	// query execution.
		return query.getResultList(); // Returns List of Results
	}

	// Read a particular user data according to their mail provided.
	@Override
	public User getUserData(String emailId) {
		/**
		 * TypedQuery<X>:
		 * 
		 * 			-> X - query result type.
		 * 
		 * 			-> public interface TypedQuery<X> extends
		 * 
		 * 			-> Query Interface used to control the execution of typed queries.
		 * 
		 * entityManager.createQuery(String qlString, Class<T> resultClass) :
		 * 
		 * 			Create an instance of TypedQuery for executing a Java Persistence query
		 * 			language statement.
		 * 
		 * 
		 */
		TypedQuery<User> query = entityManager.createQuery("SELECT c FROM USER_MANAGEMENT_API c WHERE c.email = :email",
				User.class);
		return query.setParameter("email", emailId).getSingleResult(); // Returns a single list object
	}

	// The deleteUser() is responsible for removing an object/User from the
	// Datatbase according to the ID provided
	@Override
	public String deleteUser(int id) {
		try {
			/*
			 * entityManager.createNativeQuery(): This method returns an implementation of
			 * the Query interface which is the same as if you call the createQuery method
			 * to create a JPQL query.
			 */
			Query query = entityManager.createNativeQuery("DELETE FROM USER_MANAGEMENT_API WHERE ID = " + id);
			query.executeUpdate(); // Execute an update or delete statement.
									// Returns: the number of entities updated or deleted

			return "user deleted";
		} catch (Exception e) {
			return "Error while Deleting " + e;
		}
	}

	// The Following method is used to update a particular user as per the id
	// provided.
	@Override
	public String updateUser(int id, User upUser) {
		try {
			/*
			 * <T> T find(Class<T> entityClass, Object primaryKey) :
			 * 
			 * Find by primary key, using the specified properties. Search for an entity of
			 * the specified class and primary key. If the entity instance is contained in
			 * the persistence context, it is returned from there.
			 * 
			 * Returns: The found entity instance or null if the entity does not exist
			 */
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
		} catch (Exception e) {
			log.info("Error Modifying Data: " + e);
			return "Could't Update. Check Log FIle..";
		}

	}

	// The following method is responsible for returning a list of users according
	// to their gender.
	@Override
	public List<?> getUsersByGender(String gender) {
		TypedQuery<User> query = entityManager
				.createQuery("SELECT c FROM USER_MANAGEMENT_API c WHERE c.gender =:gender", User.class);
		return query.setParameter("gender", gender).getResultList();
	}

	@Override
	public User getUsersListByAge() {

		return null;
	}

}
