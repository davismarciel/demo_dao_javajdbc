package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = new ArrayList<>();
		
		/*
		System.out.println("\n==== TEST 1: seller insert ====");
		Department newDep = new Department(null, "Test");
		departmentDao.insert(newDep);
		System.out.println("Inserted new id = " + newDep.getId());
		
		 */
		
		System.out.println("==== TEST 4: department findById ====");
		Department dep = departmentDao.findById(20);
		System.out.println(dep);
		
		
		System.out.println("\n==== TEST 3: department findAll ====");
		list = departmentDao.findAll();
		list.forEach(System.out::println);

		/*
		
		System.out.println("\n==== TEST 5: department delete ====");
		departmentDao.deleteById(8);
		System.out.println("department deleted!");		
				
		System.out.println("\n==== TEST 2: department update ====");
		dep.setName("Toys");
		departmentDao.update(dep);
		System.out.println("department updated: " + dep);
		
		
		*/
	}

}
