package com.lateef.usertodolistapi.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.lateef.usertodolistapi.Model.Post;
import com.lateef.usertodolistapi.Model.Todo;
import com.lateef.usertodolistapi.Model.User;
import com.lateef.usertodolistapi.Repository.TodoRepository;
import com.lateef.usertodolistapi.Repository.UserRepository;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getUserData() {
        return userRepository.findAll();
    }
	public User getUserById(int id){
		return userRepository.findById(id).orElse(null) ;
	}
	
	
}
