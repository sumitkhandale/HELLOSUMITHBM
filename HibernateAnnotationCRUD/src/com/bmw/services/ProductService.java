package com.bmw.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.bmw.dao.ProductDao;
import com.bmw.dao.ProductDaoImpl;
import com.bmw.model.Product;

public class ProductService {
	public static void main(String[] args) {
		ProductDao productDaoImpl = new ProductDaoImpl();
		Product p = new Product();
		p.setProductName(" Nexon XZ+");
		p.setProductPrice(945154.84);
		p.setProductCode(4545646611L);
		String datePattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		Date productLaunchDate = null;

		try {
			productLaunchDate = sdf.parse("14-03-2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.setProductLaunchDate(productLaunchDate);
		//productDaoImpl.saveProductData(p);

		// getProductDataById
		// System.out.println(productDaoImpl.getProductDataById(3));

		// SaveAllData
		Product p1 = new Product();
		p1.setProductName(" MuscleBlaze Biozyme");
		p1.setProductPrice(351222.21);
		p1.setProductCode(44513135L);
		String datePattern1 = "dd-MM-yyyy";
		SimpleDateFormat sdf1 = new SimpleDateFormat(datePattern1);
		Date productLaunchDate1 = null;

		try {
			productLaunchDate1 = sdf1.parse("18-06-2019");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.setProductLaunchDate(productLaunchDate1);
		// productDaoImpl.saveProductData(p1);

		Product p2 = new Product();
		p2.setProductName(" Creatine");
		p2.setProductPrice(6567451.20);
		p2.setProductCode(8751515L);
		String datePattern2 = "dd-MM-yyyy";
		SimpleDateFormat sdf2 = new SimpleDateFormat(datePattern2);
		Date productLaunchDate2 = null;

		try {
			productLaunchDate2 = sdf2.parse("11-12-2014");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p2.setProductLaunchDate(productLaunchDate2);
		// productDaoImpl.saveProductData(p2);

		Product p3 = new Product();
		p3.setProductName(" Body Cupid");
		p3.setProductPrice(6735432.34);
		p3.setProductCode(2114624L);
		String datePattern3 = "dd-MM-yyyy";
		SimpleDateFormat sdf3 = new SimpleDateFormat(datePattern3);
		Date productLaunchDate3 = null;

		try {
			productLaunchDate3 = sdf3.parse("21-12-2021");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p3.setProductLaunchDate(productLaunchDate3);
		productDaoImpl.saveProductData(p3);
		List<Product> plist = new LinkedList<Product>();
		plist.add(p);
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		 //productDaoImpl.saveBulkProductData(plist);
		// productDaoImpl.updateProductData(5 , p);
		// productDaoImpl.deleteProductDataById(3);
		//productDaoImpl.deleteAllProductData();
		productDaoImpl.getAllProductData().forEach(System.out::println);

	}

}
