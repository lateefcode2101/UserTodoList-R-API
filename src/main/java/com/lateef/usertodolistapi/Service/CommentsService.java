package com.lateef.usertodolistapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lateef.usertodolistapi.Model.Comment;
import com.lateef.usertodolistapi.Repository.CommentsRepository;
import com.lateef.usertodolistapi.Repository.PostsRepository;
import com.lateef.usertodolistapi.Repository.UserRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class CommentsService {

	@Autowired
	private CommentsRepository commentsRepository;
	
	@Autowired
	private PostsRepository postsRepository;
	
	@Autowired 
	private UserRepository userRepository;
	
	public List<Comment> getAllCommentsData(){
		return commentsRepository.findAll();
	}

	public Comment getUserCommentFromPostId( int postId) {
		
		return commentsRepository.findAllById(postId);

	}

//	public Comment getUserCommentFromPost(int postId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
