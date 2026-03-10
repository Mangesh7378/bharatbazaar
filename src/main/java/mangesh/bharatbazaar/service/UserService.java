package mangesh.bharatbazaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mangesh.bharatbazaar.entity.User;
import mangesh.bharatbazaar.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String register(User user) {

		if (userRepository.findByName(user.getName()) != null) {
			return "User already exists";
		}

		userRepository.save(user);
		return "Registration successful";
	}

	public String login(String name, String password) {

		User user = userRepository.findByName(name);

		if (user == null) {
			return "User not registered. Please register first.";
		}

		if (!user.getPassword().equals(password)) {
			return "Invalid password";
		}

		return "Login successful";
	}
}
