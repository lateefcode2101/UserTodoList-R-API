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

import com.fasterxml.jackson.annotation.JsonProperty;

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
@Table(name = "userinfo")
public class User {
	
//	    @Id
//	    private int id;
//	    private String name;
//	    private int quantity;
//	    private double price;
//	    
//		public int getId() {
//			return id;
//		}
//		public void setId(int id) {
//			this.id = id;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public int getQuantity() {
//			return quantity;
//		}
//		public void setQuantity(int quantity) {
//			this.quantity = quantity;
//		}
//		public double getPrice() {
//			return price;
//		}
//		public void setPrice(double price) {
//			this.price = price;
//		}
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		@Column(name="id")
		public Integer listId;
	
	@OneToMany(targetEntity = Post.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "User_Id", nullable = false, referencedColumnName = "id",updatable = false,insertable = false)
    public List<Post> posts  ;
	
	@OneToMany(targetEntity = Todo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id", nullable = false, referencedColumnName = "id",updatable = false,insertable = false)
    public List<Todo> todos;
	
		@Column(name="list_name")
		public  String listname;

		@Column(name="list_username")
		public  String listUserName;

		@Column(name="list_email")
		public	String listEmail;

		@Column(name="list_address_street")
		public		String listAddressStreet;

		@Column(name="list_address_suite")
		public	String listAddressSuite;

		@Column(name="list_address_city")
		public	String listAddressCity;

		@Column(name="list_address_zipcode")
		public	String listAddressZipcode;

		@Column(name="list_address_geo_lat")
		public	Integer listAddressGeoLat;

		@Column(name="list_address_geo_lng")
		public	Integer listAddressGeoLng;

		@Column(name="list_phone")
		public	String listPhone;

		@Column(name="list_website")
		public	String listWebsite;

		@Column(name="list_company_name")
		public	String listCompanyName;

		@Column(name="list_company_catchPhrase")
		public	String listCompanyCatchPhrase;

		@Column(name="list_company_bs")
		public	String listCompanyBs;

}
