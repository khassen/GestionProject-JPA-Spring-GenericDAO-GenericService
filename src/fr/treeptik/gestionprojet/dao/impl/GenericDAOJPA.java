package fr.treeptik.gestionprojet.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import fr.treeptik.gestionprojet.dao.GenericDAO;
import fr.treeptik.gestionprojet.exception.DAOException;

public class GenericDAOJPA<T, PK> implements GenericDAO<T, PK> {
	@PersistenceContext
	private EntityManager entityManager;

	private Class<T> type;

	public GenericDAOJPA(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	public T save(T entite) throws DAOException {
		try {
			entityManager.persist(entite);
		} catch (PersistenceException e) {
			throw new DAOException(e.getMessage(), e.getCause());
		}

		return entite;
	}

	@Override
	public void remove(T entite) throws DAOException {
		entityManager.remove(entite);
	}

//	public void delete(T entite) throws DAOException{
//		entityManager.createQuery("delete from "+type.getSimpleName()+"o where o.id = :id", type );
//	}
	@Override
	public T findById(PK id) throws DAOException {
		return entityManager.find(type, id);

	}

	// faire une requete pour recuperer tout
	@Override
	public List<T> findAll() throws DAOException {
		return entityManager.createQuery(
				"SELECT o FROM" + type.getSimpleName() + "o", type)
				.getResultList();

	}

}
