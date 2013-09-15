package fr.treeptik.gestionprojet.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="PHONE")
public class Project implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID")
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DTYPE")
	private DTYPE dtype;
	
	@Column(name="NAME")
	private String name;
	
	  //table de jointure:
	@ManyToMany
	@JoinTable(name="PROJECT_EMPLOYEE", joinColumns=@JoinColumn(name="PROJECTS_ID"),inverseJoinColumns=@JoinColumn(name="EMPLOYEES_ID"))
    private List<Employee> employees;
	
	public Project() {
		super();
	}

	

	public Project(Integer id, DTYPE dtype, String name,
			List<Employee> employees) {
		super();
		this.id = id;
		this.dtype = dtype;
		this.name = name;
		this.employees = employees;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DTYPE getDtype() {
		return dtype;
	}

	public void setDtype(DTYPE dtype) {
		this.dtype = dtype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
