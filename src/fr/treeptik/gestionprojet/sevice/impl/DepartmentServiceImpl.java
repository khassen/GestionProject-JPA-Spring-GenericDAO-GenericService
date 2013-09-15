package fr.treeptik.gestionprojet.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.gestionprojet.dao.DepartmentDAO;
import fr.treeptik.gestionprojet.exception.DAOException;
import fr.treeptik.gestionprojet.exception.ServiceException;
import fr.treeptik.gestionprojet.model.Department;
import fr.treeptik.gestionprojet.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	public Department save(Department department) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Department department) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Department findById(Integer id) throws ServiceException {
		try {
		Department 	department = departmentDAO.findById(id);
			return department;
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

	@Override
	public List<Department> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
