package com.bmw.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "productdetails")
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_name", nullable = false)
	private String productName;

	@Column(name = "product_price")
	//@Transient
	private double productPrice;

	@Column(name = "product_code", unique = true)
	private long productCode;

	@Column(name = "product_launch_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date productLaunchDate;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public long getProductCode() {
		return productCode;
	}

	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}

	public Date getProductLaunchDate() {
		return productLaunchDate;
	}

	public void setProductLaunchDate(Date productLaunchDate) {
		this.productLaunchDate = productLaunchDate;
	}

	@Override
	public String toString() {
		String dPattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(dPattern);
		String launchDate = sdf.format(productLaunchDate);
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productCode=" + productCode + ", productLaunchDate=" + launchDate + "]";
	}

}
