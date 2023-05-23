package com.lateef.usertodolistapi.DTO;

import com.lateef.usertodolistapi.Model.Comment;
import com.lateef.usertodolistapi.Model.Post;
import com.lateef.usertodolistapi.Model.Todo;
import com.lateef.usertodolistapi.Model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DtoRequest {
	
	private User user;
	private Todo todo;
	private Comment comment;
	private Post post;

	public Todo getTodo() {
		return todo;
	}

	public void setTodo(Todo todo) {
		this.todo = todo;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
