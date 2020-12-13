/*
 * package com.cs631.nfc.beans;
 * 
 * import java.sql.Date; import java.util.List;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.FetchType; import
 * javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.JoinTable; import javax.persistence.ManyToOne; import
 * javax.persistence.OneToMany; import javax.persistence.OneToOne; import
 * javax.persistence.Table;
 * 
 * import org.springframework.format.annotation.DateTimeFormat;
 * 
 * import com.sun.istack.NotNull;
 * 
 * @Entity public class CustomerAddInv {
 * 
 * @Id private int cid;
 * 
 * @NotNull private String firstname;
 * 
 * @NotNull private String lastname;
 * 
 * @DateTimeFormat(pattern = "yyyy-MM-dd") private Date dob;
 * 
 * private int addid;
 * 
 * @NotNull private String add1;
 * 
 * @NotNull private String add2;
 * 
 * @NotNull private String city;
 * 
 * @NotNull private String state;
 * 
 * @NotNull private int zip;
 * 
 * private String username; private String password;
 * 
 * 
 * @OneToMany private List<Integer> iid;
 * 
 * @OneToMany
 * 
 * @NotNull private List<String> Name;
 * 
 * @OneToMany private List<Integer> amount;
 * 
 * @OneToMany private List<Integer> wid;
 * 
 * public int getCid() { return cid; }
 * 
 * public void setCid(int cid) { this.cid = cid; }
 * 
 * public String getFirstname() { return firstname; }
 * 
 * public void setFirstname(String firstname) { this.firstname = firstname; }
 * 
 * public String getLastname() { return lastname; }
 * 
 * public void setLastname(String lastname) { this.lastname = lastname; }
 * 
 * public Date getDob() { return dob; }
 * 
 * public void setDob(Date dob) { this.dob = dob; }
 * 
 * public int getAddid() { return addid; }
 * 
 * public void setAddid(int addid) { this.addid = addid; }
 * 
 * public String getAdd1() { return add1; }
 * 
 * public void setAdd1(String add1) { this.add1 = add1; }
 * 
 * public String getAdd2() { return add2; }
 * 
 * public void setAdd2(String add2) { this.add2 = add2; }
 * 
 * public String getCity() { return city; }
 * 
 * public void setCity(String city) { this.city = city; }
 * 
 * public String getState() { return state; }
 * 
 * public void setState(String state) { this.state = state; }
 * 
 * public int getZip() { return zip; }
 * 
 * public void setZip(int zip) { this.zip = zip; }
 * 
 * public String getUsername() { return username; }
 * 
 * public void setUsername(String username) { this.username = username; }
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * public List<Integer> getIid() { return iid; }
 * 
 * public void setIid(List<Integer> iid) { this.iid = iid; }
 * 
 * public List<String> getName() { return Name; }
 * 
 * public void setName(List<String> name) { Name = name; }
 * 
 * public List<Integer> getAmount() { return amount; }
 * 
 * public void setAmount(List<Integer> amount) { this.amount = amount; }
 * 
 * public List<Integer> getWid() { return wid; }
 * 
 * public void setWid(List<Integer> wid) { this.wid = wid; }
 * 
 * @Override public String toString() { return "CustomerAddInv [cid=" + cid +
 * ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob +
 * ", addid=" + addid + ", add1=" + add1 + ", add2=" + add2 + ", city=" + city +
 * ", state=" + state + ", zip=" + zip + ", username=" + username +
 * ", password=" + password + ", iid=" + iid + ", Name=" + Name + ", amount=" +
 * amount + ", wid=" + wid + "]"; }
 * 
 * }
 */