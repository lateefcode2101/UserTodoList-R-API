package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
import model.test;
import repository.TestRepository;

@Getter
@Setter
@Service
public class TestService {

	@Autowired
	private TestRepository tRepository;

	public List<test> getProducts() {
		System.out.println(tRepository.findAll().toString());
		System.out.println("inside get products");
		return tRepository.findAll();
	}

//	private static List<test> list = new ArrayList<>();
//
//	static {
//		test t=new test();
//		t.setListId(10);
//		t.setuName("setname1");
//		t.setUserName("setusername1");
//		list.add(t);
//	}
//

}
