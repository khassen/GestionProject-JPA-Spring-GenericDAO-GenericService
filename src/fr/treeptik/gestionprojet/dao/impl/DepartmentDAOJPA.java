package fr.treeptik.gestionprojet.dao.impl;


import org.springframework.stereotype.Repository;

import fr.treeptik.gestionprojet.dao.DepartmentDAO;
import fr.treeptik.gestionprojet.model.Department;

@Repository
public class DepartmentDAOJPA extends GenericDAOJPA<Department, Integer> implements DepartmentDAO {

	public DepartmentDAOJPA() {
		super(Department.class);
		// TODO Auto-generated constructor stub
	}



}
