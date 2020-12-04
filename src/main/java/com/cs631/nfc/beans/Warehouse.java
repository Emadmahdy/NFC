package com.cs631.nfc.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Warehouse {

	@Id
	private int wid;
	
	@NotNull
	private String name;
	
	
	private String add1;
	private String add2;
	private String city;
	private String state;
	private int zip;
}
