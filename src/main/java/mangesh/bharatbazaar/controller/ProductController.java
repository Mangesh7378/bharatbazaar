package mangesh.bharatbazaar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mangesh.bharatbazaar.entity.Product;
import mangesh.bharatbazaar.service.ProductServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	// Add Product
	@PostMapping
	public String addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	@PostMapping("/bulk")
	public String addProducts(@RequestBody List<Product> products){
	    return productService.addProducts(products);
	}

	// Get All Products
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	// Update Product
	@PutMapping("/{id}")
	public String updateProduct(@PathVariable Long id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

	// Delete Product
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}

}
