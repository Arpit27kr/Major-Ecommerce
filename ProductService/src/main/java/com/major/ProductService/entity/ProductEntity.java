package com.major.ProductService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productid;
	
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRICE")
	private long price;
	@Column(name="QUANTITY")
	private long quantity;

}
