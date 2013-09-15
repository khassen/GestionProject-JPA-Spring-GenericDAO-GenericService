package fr.treeptik.gestionprojet.service;

import java.util.List;

import fr.treeptik.gestionprojet.exception.ServiceException;
import fr.treeptik.gestionprojet.model.Department;

public interface DepartmentService {

	Department save(Department department) throws ServiceException;
	void remove(Department department) throws ServiceException;
	Department findById(Integer id) throws ServiceException;
	List<Department> findAll() throws ServiceException;
}
