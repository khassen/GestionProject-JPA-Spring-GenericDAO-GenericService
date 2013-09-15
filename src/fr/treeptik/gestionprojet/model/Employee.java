package fr.treeptik.gestionprojet.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID")
	private Integer id;
	@Column(name ="Name")
	private String name;
	@Column(name ="SALARY")
	private BigInteger salary;
	@Column(name ="SARTDATE")
	private Date startDate;
	
	@OneToOne
	@JoinColumn(name="MANAGER_ID")
	private Employee employee;
	
	@OneToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	
	//Relation bidirectionnelle non obliga
	@OneToOne(mappedBy="employee")
	private Phone phone;

    @ManyToOne() 
    @JoinColumn(name="DEPARTMENT_ID")
    private Department department;

	public Employee() {
		super();
	}


	public Employee(Integer id, String name, BigInteger salary, Date startDate,
			Address address, Phone phone, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.startDate = startDate;
		this.address = address;
		this.phone = phone;
		this.department = department;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getSalary() {
		return salary;
	}

	public void setSalary(BigInteger salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
    
  
    
    
	
}
