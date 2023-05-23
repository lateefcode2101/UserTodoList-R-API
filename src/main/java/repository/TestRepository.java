package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.test;

public interface TestRepository extends JpaRepository<test, Integer> {

	// public List<test> getProducts();
}
