package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(System.out::println);
		
		System.out.println("\n==== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n==== TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = " + newSeller.getId());
		
		/*
		System.out.println("\n==== TEST 5: seller update ====");
		seller = sellerDao.findById(9);
		seller.setName("Miles Morales");
		seller.setEmail("miles@gmail.com");
		sellerDao.update(seller);
		 */
		
		System.out.println("Seller updated: " + seller);
		
		System.out.println("\n==== TEST 5: seller delete ====");
		sellerDao.deleteById(20);
		System.out.println("Seller deleted!");
		
	}

}
