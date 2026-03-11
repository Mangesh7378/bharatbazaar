package mangesh.bharatbazaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mangesh.bharatbazaar.entity.Order;
import mangesh.bharatbazaar.repository.OrderRepository;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    // Place order
    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    // Get all orders
    @GetMapping
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    // Cancel order (Delete)
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }

}
