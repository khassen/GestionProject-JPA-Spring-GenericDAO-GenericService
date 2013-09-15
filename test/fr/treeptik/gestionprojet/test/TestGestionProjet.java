package fr.treeptik.gestionprojet.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.gestionprojet.exception.ServiceException;
import fr.treeptik.gestionprojet.model.Address;
import fr.treeptik.gestionprojet.model.Department;
import fr.treeptik.gestionprojet.service.AddressService;
import fr.treeptik.gestionprojet.service.DepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestGestionProjet {

	@Autowired
	private AddressService addressService;

	@Autowired
	private DepartmentService departmentService;
	
	@Test
	@Ignore
	public void testSaveAddress() {
		try {
			Address address = addressService.save(new Address(null, "Fes",
					"Mekhrass", "Macarona", "13000"));
			Assert.assertNotNull(address.getCity());
		} catch (ServiceException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	@Ignore
	@Transactional
	@Rollback(false)
	public void testRemoveAddress() {
		Address address = new Address();
		address.setId(10);
		try {
//			addressService.findById(address);
//			System.out.println(address.getCity());
			addressService.remove(address);
		} catch (ServiceException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testFindDepartment(){
		
		Department department = new Department();
		try {
			department = departmentService.findById(1);
			System.out.println(department.getName());
			
			//Assert.assertNotNull(department.getName());
			
		} catch (ServiceException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
