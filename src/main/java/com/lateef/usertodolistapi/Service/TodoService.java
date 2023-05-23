package com.lateef.usertodolistapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lateef.usertodolistapi.Model.Todo;
import com.lateef.usertodolistapi.Repository.TodoRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;

	public List<Todo> getAllTodoData() {
        return todoRepository.findAll();
    }

	public Todo getUserTodoById(int userid) {
		// TODO Auto-generated method stub
		return todoRepository.findById(userid).orElse(null) ;
	}
}
