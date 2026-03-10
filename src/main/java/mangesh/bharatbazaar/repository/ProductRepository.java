package mangesh.bharatbazaar.repository;
   
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mangesh.bharatbazaar.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
