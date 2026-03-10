package mangesh.bharatbazaar.entity;
 

	import jakarta.persistence.*;

	@Entity
	@Table(name = "orders")
	public class Order {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String productName;

	    private double price;

	    private int quantity;

	    private String image;

	    public Order() {}

	    public Order(String productName, double price, int quantity, String image) {
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	        this.image = image;
	    }

	    // Getter Setter

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }
	}

