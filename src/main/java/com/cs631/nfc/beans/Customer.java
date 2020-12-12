package com.cs631.nfc.beans;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	private int cid;
	
	@NotNull
	private String firstname;
	
	@NotNull
	private String lastname;
	
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinTable(name = "address", joinColumns = {@JoinColumn(name="addid", referencedColumnName = "aid")})
	//@JoinTable(name="address",
    //joinColumns={@JoinColumn(name="addid", referencedColumnName="aid")})
	//@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "addid", referencedColumnName = "aid")
	private int  addid;
	
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstName) {
		this.firstname = firstName;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastName) {
		this.lastname = lastName;
	}
	public int getaddid() {
		return addid;
	}
	public void setaddid(int addid) {
		this.addid = addid;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", firstName=" + firstname + ", lastName=" + lastname + ", dob=" + dob
				+ ", addid=" + addid + ", username=" + username + "]";
	}
	
	
	
	
}
