package fr.treeptik.gestionprojet.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="PHONE")
public class Phone  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID")
	private Long id;
	@Column(name ="NUMBER")
	private String number;
	@Column(name ="TYPE")
	private String type;
	
	@OneToOne
	@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;

	public Phone(Long id, String number, String type, Employee employee) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.employee = employee;
	}

	public Phone() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
