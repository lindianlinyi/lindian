package com.lindian.domain;

import java.io.Serializable;

public class Production implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
	String pic;
	String productSn;
	String originalPrice;
	String stock;
	String keywords;
	String detailTitle;
	String brandName;
	String productCategoryName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getProductSn() {
		return productSn;
	}
	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDetailTitle() {
		return detailTitle;
	}
	public void setDetailTitle(String detailTitle) {
		this.detailTitle = detailTitle;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	
}
