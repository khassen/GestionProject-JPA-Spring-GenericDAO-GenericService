package fr.treeptik.gestionprojet.dao.impl;

import java.math.BigInteger;

import fr.treeptik.gestionprojet.dao.EmployeeDAO;
import fr.treeptik.gestionprojet.model.Employee;

public class EmployeeDAOJPA extends GenericDAOJPA<Employee, BigInteger> implements EmployeeDAO{

	public EmployeeDAOJPA() {
		super(Employee.class);
		// TODO Auto-generated constructor stub
	}

}
