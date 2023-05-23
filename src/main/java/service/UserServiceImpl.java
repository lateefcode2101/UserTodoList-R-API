package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	private UserRepository uRepo;
	// Getting the list view of Array
//	public List<User> users = new ArrayList<>(Arrays.asList(new User(1,"asdf","asdf"),new User(2,"asdf2","asdf2"),new User(3,"asdf3","asdf3")));

	@Override
	public List<User> getAllUsers() {
//

		return uRepo.findAll();
	}
	//@SuppressWarnings("unchecked")
//	@SuppressWarnings("unlikely-arg-type")
//	public User getUserWithId(long i) {
//		System.out.println(users.indexOf(1));
//		return  users.get((int) i);
//	}
}
