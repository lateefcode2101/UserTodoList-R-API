package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.test;
import service.TestService;

@RestController
public class testController {

	@Autowired
	private TestService testService;

	@GetMapping("/test")
	public List<test> getTest() {
		return testService.getProducts();
	}

}
