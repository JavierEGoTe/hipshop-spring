package hipshop.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hipshop.models.Card;
import hipshop.models.User;
import hipshop.repositories.UserRepository;



@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public ArrayList<User> getUsers(){
		return (ArrayList<User>) userRepository.findAll();
	}
	public User saveUser(User user) {
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		Date dateBirth = user.getDateBirth();
		String address = user.getAddress();
		String email = user.getEmail();
		String password = user.getPassword();
		String phoneNumber = user.getPhoneNumber();
		String aka = user.getAka();
		List <Card> cards = user.getCards();
		
		if(email != null && password != null) {
			return userRepository.save(user);
		}
		
		return user;
	}
	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}
	public boolean deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	public ArrayList<User>getUserByName(String firstName){
		return userRepository.findByName(firstName);
	}
}
