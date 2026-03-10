package mangesh.bharatbazaar.service;

import java.util.List;

import mangesh.bharatbazaar.entity.Product;

public interface ProductService {

	String addProduct(Product product);

	List<Product> getAllProducts();
	String addProducts(List<Product> products);

	String updateProduct(Long id, Product product);

	String deleteProduct(Long id);

}
