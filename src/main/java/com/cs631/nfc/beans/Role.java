package com.cs631.nfc.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Role {

	@Id
	private int rid;
	
	@NotNull
	private String name;
	
}
