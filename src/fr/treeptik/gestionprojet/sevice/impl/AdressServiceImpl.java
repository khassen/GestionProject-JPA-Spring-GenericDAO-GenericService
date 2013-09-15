package fr.treeptik.gestionprojet.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.gestionprojet.dao.AddressDAO;
import fr.treeptik.gestionprojet.exception.DAOException;
import fr.treeptik.gestionprojet.exception.ServiceException;
import fr.treeptik.gestionprojet.model.Address;
import fr.treeptik.gestionprojet.service.AddressService;

@Service
public class AdressServiceImpl implements AddressService {

	@Autowired
	private AddressDAO addressDAOJPA;

	@Override
	@Transactional
	public Address save(Address address) throws ServiceException {

		try {
			addressDAOJPA.save(address);
			return address;
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

	@Override
	public void remove(Address address) throws ServiceException {

		try {
			address = addressDAOJPA.findById(address.getId());
			addressDAOJPA.remove(address);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public Address findById(Address address) throws ServiceException {
		try {
			addressDAOJPA.findById(address.getId());
			return address;
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

	@Override
	public List<Address> findAll() throws ServiceException {
		try {
			List<Address> listaddress = addressDAOJPA.findAll();
			return listaddress;
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

}
