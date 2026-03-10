package mangesh.bharatbazaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mangesh.bharatbazaar.entity.Product;
import mangesh.bharatbazaar.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public String addProduct(Product product) {
		productRepository.save(product);
		return "Product Successfully Added";
	}
	@Override
	public String addProducts(List<Product> products) {

	    productRepository.saveAll(products);

	    return "All Products Added Successfully";
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public String updateProduct(Long id, Product product) {

		Optional<Product> existing = productRepository.findById(id);

		if (existing.isPresent()) {
			Product p = existing.get();
			p.setName(product.getName());
			p.setCategory(product.getCategory());
			p.setPrice(product.getPrice());
			p.setDiscount(product.getDiscount());
			p.setImage(product.getImage());

			productRepository.save(p);

			return "Product Updated Successfully";
		}

		return "Product Not Found";
	}

	@Override
	public String deleteProduct(Long id) {

		if (productRepository.existsById(id)) {
			productRepository.deleteById(id);
			return "Product Deleted Successfully";
		}

		return "Product Not Found";
	}
}
