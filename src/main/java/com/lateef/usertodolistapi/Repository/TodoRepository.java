package com.lateef.usertodolistapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lateef.usertodolistapi.Model.Todo;
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
