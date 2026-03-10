package mangesh.bharatbazaar.service;
 

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import mangesh.bharatbazaar.entity.Order;
	import mangesh.bharatbazaar.repository.OrderRepository;

	@Service
	public class OrderServiceImpl implements OrderService{

	    @Autowired
	    private OrderRepository orderRepository;

	    @Override
	    public Order saveOrder(Order order) {
	        return orderRepository.save(order);
	    }

	    @Override
	    public List<Order> getAllOrders() {
	        return orderRepository.findAll();
	    }

	}


