package com.lateef.usertodolistapi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.lateef.usertodolistapi.Model.Comment;
import com.lateef.usertodolistapi.Model.Post;

public interface CommentsRepository extends JpaRepository<Comment, Integer> {

	//public Comment findPost(Post post);

	public Comment findAllById(int postId);

	
}
