package com.cms.pastor1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PastorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String firstname;
     private String lastname;
     private String E_mail;
     private String password;
     private String conformpassword;
     
     //generate getter setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getE_mail() {
		return E_mail;
	}
	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformpassword() {
		return conformpassword;
	}
	public void setConformpassword(String conformpassword) {
		this.conformpassword = conformpassword;
	}

	//constructor using fields
	public PastorEntity(int id, String firstname, String lastname, String e_mail, String password,
			String conformpassword) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		E_mail = e_mail;
		this.password = password;
		this.conformpassword = conformpassword;
	}
	//generate constructor from superclass
	public PastorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
     
     
}
