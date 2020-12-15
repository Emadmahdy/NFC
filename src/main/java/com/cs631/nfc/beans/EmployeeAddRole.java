package com.cs631.nfc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class EmployeeAddRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	@NotNull
	private String firstname;
	
	@NotNull
	private String lastname;
	private int addid;
	private int role;
	
	@NotNull
	private String add1;
	
	
	private String add2;
	
	@NotNull
	private String city;
	
	@NotNull
	private String state;
	
	@NotNull
	private int zip;
	
	private int rid;
	private String name;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "EmployeeAddRole [eid=" + eid + ", firstname=" + firstname + ", lastname=" + lastname + ", addid="
				+ addid + ", role=" + role + ", add1=" + add1 + ", add2=" + add2 + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", rid=" + rid + ", name=" + name + "]";
	}
	
}
