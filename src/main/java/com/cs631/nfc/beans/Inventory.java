package com.cs631.nfc.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Inventory {

	@Id
	private int iid;
	
	@NotNull
	private String Name;
	
	private int amount;
	private int wid;
}
