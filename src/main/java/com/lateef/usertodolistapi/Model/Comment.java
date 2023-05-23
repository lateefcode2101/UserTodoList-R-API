package com.lateef.usertodolistapi.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments_table")
public class Comment {
	
	@Column(name="postId")
	public Integer postId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	public Integer id;
	
//	@OneToMany(mappedBy = "comments_table", cascade = CascadeType.ALL)
//    private List<Post> post;
//	
	@Column(name="name")
	public String  name;
	
	@Column(name="email")
	public String  email;
	
	@Column(name="body")
	public String  body;
}
