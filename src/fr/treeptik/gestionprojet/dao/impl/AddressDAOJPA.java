package fr.treeptik.gestionprojet.dao.impl;

import org.springframework.stereotype.Repository;

import fr.treeptik.gestionprojet.dao.AddressDAO;
import fr.treeptik.gestionprojet.model.Address;

@Repository
public class AddressDAOJPA extends GenericDAOJPA<Address, Integer> implements AddressDAO{

	public AddressDAOJPA() {
		super(Address.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
