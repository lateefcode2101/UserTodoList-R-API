package com.lateef.usertodolistapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lateef.usertodolistapi.Model.Post;
@Repository
public interface PostsRepository extends JpaRepository<Post, Integer> {

}
