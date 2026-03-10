package mangesh.bharatbazaar.service;
 

	import java.util.List;

	import mangesh.bharatbazaar.entity.Order;

	public interface OrderService {

	    Order saveOrder(Order order);

	    List<Order> getAllOrders();

	
}
