package com.cs631.nfc.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	
	@NotNull
	private String type;
	
	@NotNull
	private int cid;
	@NotNull
	private int iid;
	
	private int amount;
	
	private int wid;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date date;
	
	private boolean processed;
	
	
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isProcessed() {
		return processed;
	}
	public void setProcessed(boolean processed) {
		this.processed = processed;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", type=" + type + ", cid=" + cid + ", iid=" + iid + ", amount=" + amount
				+ ", wid=" + wid + ", date=" + date + ", processed=" + processed + "]";
	}
	
}
