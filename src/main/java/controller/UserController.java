package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import service.UserServiceImpl;

@RestController
@RequestMapping("/use")
public class UserController {

	@Value("${spring.datasourcea.url: default url}")
	String url;

	@GetMapping("/showdatasourceurl")
	public String showdatasourceurl() {
		return url;
	}

	@Autowired
	private UserServiceImpl userServiceImpl;


	@GetMapping("/apii")
	public List<User> getallusers() {
		return userServiceImpl.getAllUsers();
	}

	@GetMapping("/apii/{id}")
	public String getall(@PathVariable("id") Long id) {
		return "fetching user details with id " + id;
	}

	// xgetUserWithId
//	@GetMapping("/apii/userofid/{id}")
//	public User getuserofid(@PathVariable Long id) {
//		return userServiceImpl.getUserWithId(id);
//	}

	@PostMapping("/apii")
	public String getalltests(@RequestBody User user) {
		return "saving user details " + user.listId;
	}

	@DeleteMapping("/apii")
	public String deleteUser(@RequestParam("isa") Long id) {
		return "invoking reletemapping method with " + id;
	}

	@PutMapping("/putmethod/{id}")
	public User putdemo(@PathVariable("id") Long id,@RequestBody User user) {
		System.out.println("inside put method");
		return user;
	}
//    @GetMapping("/apii")
//    public List<User>  getAll() {
//		return (List<User>) userDao.findAll();
//		//return userService.getAllUsers();
//	}
//
//    @PostMapping("/showuser")
//    public String  showUsers(@RequestBody List<User> user) {
//    	userDao.saveAll(user);
//		return "users saved "+user.size();
//	}

	// @RequestMapping(value="/apii",method=RequestMethod.GET)

}
