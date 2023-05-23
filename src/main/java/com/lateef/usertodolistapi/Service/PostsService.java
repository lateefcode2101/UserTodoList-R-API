package com.lateef.usertodolistapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lateef.usertodolistapi.Model.Post;
import com.lateef.usertodolistapi.Repository.PostsRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class PostsService {

	@Autowired
	private PostsRepository postRepository;

	public List<Post> getAllPostsData() {
        return postRepository.findAll();
    }
	public Post getPostById(int id){
		return postRepository.findById(id).orElse(null) ;
	}
	public Post getUserPostById(int userid) {
		// TODO Auto-generated method stub
		return postRepository.findById(userid).orElse(null) ;
	}
}
