package com.lateef.usertodolistapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lateef.usertodolistapi.DTO.DtoRequest;
import com.lateef.usertodolistapi.Model.Comment;
import com.lateef.usertodolistapi.Model.Post;
import com.lateef.usertodolistapi.Model.Todo;
import com.lateef.usertodolistapi.Model.User;
import com.lateef.usertodolistapi.Repository.CommentsRepository;
import com.lateef.usertodolistapi.Repository.PostsRepository;
import com.lateef.usertodolistapi.Repository.TodoRepository;
import com.lateef.usertodolistapi.Repository.UserRepository;
import com.lateef.usertodolistapi.Service.CommentsService;
import com.lateef.usertodolistapi.Service.PostsService;
import com.lateef.usertodolistapi.Service.TodoService;
import com.lateef.usertodolistapi.Service.UserService;
@RestController
@RequestMapping("/api/user/{userid}")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PostsRepository postsRepository;
	@Autowired
	private TodoRepository todoRepository;

	@Autowired
	private UserService userService;
	
	@Autowired
	private TodoService todoService;
	
	@Autowired
	private PostsService postsService;
	
	@Autowired
	private CommentsService commentsService;
	
//	@PostMapping("/postMapUserPosts")
//	public User getPosts(@RequestBody DtoRequest request) {
//		return userRepository.save(request.getUser());		
//	}
//	
	@GetMapping("/getalluserdata")
	public List<User> getUserData(){
		return userService.getUserData();
	}
	
//	@GetMapping("/{userid}")
//	public User getUserData(@PathVariable int userid){
//		return userService.getUserById(userid);
//	}
	@GetMapping("/posts")
	public Post getUserPost(@PathVariable int userid){
		return postsService.getUserPostById(userid);
	}
	@GetMapping("/todos")
	public Todo getUserTodo(@PathVariable int userid){
		return todoService.getUserTodoById(userid);
	}
	
	@GetMapping("/posts/{postId}/comments")
	public Comment getUserCommentFromPost(@PathVariable int userid,@PathVariable int postId){
		return commentsService.getUserCommentFromPostId(postId);
	}
	@PostMapping("/posts")
	public Post setUserPost(@RequestBody DtoRequest request) {
		return postsRepository.save(request.getPost());		
	}
	
	@PostMapping("/todos")
	public Todo setUserTodo(@RequestBody DtoRequest request) {
		return todoRepository.save(request.getTodo());		
	}
	
//	@PostMapping("/postMapUserPosts")
//	public User getPosts(@RequestBody DtoRequest request) {
//		return userRepository.save(request.getUser());		
//	}
	
	@GetMapping("/getallusertodos")
	public List<Todo> getTodoData(){
		return todoService.getAllTodoData();
	}
	
	@GetMapping("/getalluserposts")
	public List<Post> getPostsData(){
		return postsService.getAllPostsData();
	}
	
	@GetMapping("/getpostbyid/{id}")
	public Post getPostByUserId(@PathVariable int id){
		return postsService.getPostById(id);
	}
	
	@GetMapping("/getallusercomments")
	public List<Comment> getCommentsData(){
		return commentsService.getAllCommentsData();
	}
	
	
}
