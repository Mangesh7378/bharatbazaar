package mangesh.bharatbazaar.repository;
 

	import org.springframework.data.jpa.repository.JpaRepository;
	import mangesh.bharatbazaar.entity.Order;

	public interface OrderRepository extends JpaRepository<Order, Long> {

	}

