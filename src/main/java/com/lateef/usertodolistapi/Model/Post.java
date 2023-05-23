package com.lateef.usertodolistapi.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "posts_table")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	public Integer id;
	
	@Column(name="User_Id")
	public Integer User_Id;
	
	
//	@OneToMany(mappedBy = "posts_table", cascade = CascadeType.ALL)
//    private List<User> user;
	
//	@ManyToOne(optional = false)
//    @JoinColumn(name = "User_Id", nullable = false, referencedColumnName = "id")
//    public Comment comment;
	
	@OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "postId", nullable = false, referencedColumnName = "id",updatable = false,insertable = false)
    public List<Comment> comments  ;
		
	@Column(name="Title")
	public String  Title;
	
	@Column(name="Body")
	public String  Body;
}
