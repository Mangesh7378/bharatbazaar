package mangesh.bharatbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mangesh.bharatbazaar.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);

}
