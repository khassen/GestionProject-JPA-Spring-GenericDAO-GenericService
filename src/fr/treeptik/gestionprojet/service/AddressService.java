package fr.treeptik.gestionprojet.service;

import java.util.List;

import fr.treeptik.gestionprojet.exception.ServiceException;
import fr.treeptik.gestionprojet.model.Address;



public interface AddressService {

	Address save(Address address) throws ServiceException;
	void remove(Address address) throws ServiceException;
	Address findById(Address address) throws ServiceException;
	List<Address> findAll() throws ServiceException;
	
}
