package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="newTab")
public class User {
//	Integer listId;
//String listname;
//String listUserName;

	public User() {
	}

	public User(Integer listId, String listname, String listUserName) {
		this.listId = listId;
		this.listname = listname;
		this.listUserName = listUserName;
	}


	public User(Integer listId, String listname, String listUserName, String listEmail, String listAddressStreet,
			String listAddressSuite, String listAddressCity, Integer listAddressZipcode, Integer listAddressGeoLat,
			Integer listAddressGeoLng, Integer listPhone, String listWebsite, String listCompanyName,
			String listCompanyCatchPhrase, String listCompanyBs) {
		this.listId = listId;
		this.listname = listname;
		this.listUserName = listUserName;
		this.listEmail = listEmail;
		this.listAddressStreet = listAddressStreet;
		this.listAddressSuite = listAddressSuite;
		this.listAddressCity = listAddressCity;
		this.listAddressZipcode = listAddressZipcode;
		this.listAddressGeoLat = listAddressGeoLat;
		this.listAddressGeoLng = listAddressGeoLng;
		this.listPhone = listPhone;
		this.listWebsite = listWebsite;
		this.listCompanyName = listCompanyName;
		this.listCompanyCatchPhrase = listCompanyCatchPhrase;
		this.listCompanyBs = listCompanyBs;
	}

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id")
	public Integer listId;
@JsonProperty("Fullname")
	//@Column(name="list_name")
	public  String listname;

	//@Column(name="list_username")
	public  String listUserName;

	@Column(name="list_email")
	String listEmail;

	@Column(name="list_address_street")
	String listAddressStreet;

	@Column(name="list_address_suite")
	String listAddressSuite;

	@Column(name="list_address_city")
	String listAddressCity;

	@Column(name="list_address_zipcode")
	Integer listAddressZipcode;

	@Column(name="list_address_geo_lat")
	Integer listAddressGeoLat;

	@Column(name="list_address_geo_lng")
	Integer listAddressGeoLng;

	@Column(name="list_phone")
	Integer listPhone;

	@Column(name="list_website")
	String listWebsite;

	@Column(name="list_company_name")
	String listCompanyName;

	@Column(name="list_company_catchPhrase")
	String listCompanyCatchPhrase;

	@Column(name="list_company_bs")
	String listCompanyBs;


}
