package com.bmw.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bmw.model.Product;

public class ProductDaoImpl implements ProductDao {
	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public List<Product> getAllProductData() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Product> prodlist = session.createQuery("from Product").list();
		return prodlist;
	}

	@Override
	public Product getProductDataById(int productId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Product pp = new Product();
		List<Product> prod = session.createQuery("from Product").list();
		for (Product dps : prod) {
			if (dps.getProductId() == productId) {
				pp.setProductId(dps.getProductId());
				pp.setProductName(dps.getProductName());
				pp.setProductPrice(dps.getProductPrice());
				pp.setProductCode(dps.getProductCode());
				pp.setProductLaunchDate(dps.getProductLaunchDate());

			}
		}
		return pp;
	}

	@Override
	public void saveProductData(Product product) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();

	}

	@Override
	public void saveBulkProductData(List<Product> products) {
		// TODO Auto-generated method stub
		for (Product kaif : products) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(kaif);
			transaction.commit();
		}

	}

	@Override
	public void updateProductData(int productId, Product product) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Product> prdslist = session.createQuery("from Product").list();
		for (Product deepika : prdslist) {
			if (deepika.getProductId() == productId) {
				deepika.setProductName(product.getProductName());
				deepika.setProductPrice(product.getProductPrice());
				deepika.setProductCode(product.getProductCode());
				deepika.setProductLaunchDate(product.getProductLaunchDate());
				session.update(deepika);
				transaction.commit();

			}

		}

	}

	@Override
	public void deleteProductDataById(int productId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Product> prdslist = session.createQuery("from Product").list();
		for (Product deepika : prdslist) {
			if (deepika.getProductId() == productId) {
				session.delete(deepika);
				transaction.commit();

			}

		}

	}

	@Override
	public void deleteAllProductData() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Product> prdslist = session.createQuery("from Product").list();
		for (Product deepika : prdslist) {
			Transaction transaction = session.beginTransaction();

			session.delete(deepika);
			transaction.commit();

		}

	}

}
