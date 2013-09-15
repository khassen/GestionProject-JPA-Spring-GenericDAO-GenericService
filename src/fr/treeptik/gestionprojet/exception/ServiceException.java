package fr.treeptik.gestionprojet.exception;

public class ServiceException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public ServiceException(String message, Throwable cause) {
		super(message);
	}
}
