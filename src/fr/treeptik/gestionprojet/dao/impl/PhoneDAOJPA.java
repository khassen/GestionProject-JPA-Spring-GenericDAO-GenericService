package fr.treeptik.gestionprojet.dao.impl;

import java.math.BigInteger;

import fr.treeptik.gestionprojet.dao.PhoneDAO;
import fr.treeptik.gestionprojet.model.Phone;

public class PhoneDAOJPA extends GenericDAOJPA<Phone, BigInteger> implements PhoneDAO{

	public PhoneDAOJPA() {
		super(Phone.class);
		// TODO Auto-generated constructor stub
	}

}
