package com.demo.struts.followyourstar.persistent.daos;

import java.util.List;

/**
 * This Is The Root Interface for all DAO implementations
 * 
 * @author Sagar Mahapatro
 *
 * @param <T>
 */

public interface GenaricDAO<T> {

	/**
	 * Get Object From DB using ID
	 * 
	 * @param id
	 * @return
	 */
	T getByID(Long id);

	/**
	 * Get All Object From DB present in the DB
	 * 
	 * @return
	 */
	List<T> getAll();

	/**
	 * Save The Object into the DB
	 * 
	 * @param t
	 * @return
	 */
	Boolean save(T t);

	/**
	 * Delete The Object From the DB
	 * 
	 * @param t
	 */
	void delete(T t);

}
