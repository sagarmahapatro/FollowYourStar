package com.demo.struts.followyourstar.persistent.daos.impl.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.log4j.Logger;

import com.demo.struts.followyourstar.persistent.daos.GenaricDAO;

public class GenaricDAOJPAImpl<T> implements GenaricDAO<T> {

	private static final Logger logger = Logger.getLogger(GenaricDAOJPAImpl.class);
	private Class<T> type;
	protected EntityManager entityManager;

	public GenaricDAOJPAImpl(Class<T> t) {
		this.type = t;
	}

	public T getByID(Long id) {
		if (id == null) {
			return null;
		} else {
			return entityManager.find(type, id);
		}

	}

	public List<T> getAll() {
		return entityManager.createQuery(
				"SELECT e FROM " + type.getName() + "e").getResultList();
	}

	public Boolean save(T t) {
		try{
		entityManager.persist(t);
		}
		catch(Exception e){
			logger.debug(" save failed "+e);
		}
		return true;
	}

	public void delete(T t) {
		entityManager.remove(t);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
