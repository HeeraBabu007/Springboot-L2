package com.ef.springboot;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {

	@Override
	public List<Product> findAll() {
		ArrayList<Product> products = new ArrayList<Product>();

		products.add(new Product(1000, "Mobile", "SFSFFSFS", 90000.00, 6));
		products.add(new Product(1001, "Smart TV", "LGSSDDS", 60000.00, 3));
		products.add(new Product(1002, "Washing Machine", "TODSSS", 90000.00, 7));
		products.add(new Product(1003, "Laptop", "APPLE345", 240000.00, 1));
		products.add(new Product(1004, "Air Conditioner", "ACL9090", 300000.00, 5));
		products.add(new Product(1005, "Refrigerator ", "12WARTYU", 100000.00, 4));

		return products;
	}

}
