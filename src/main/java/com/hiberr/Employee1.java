package com.hiberr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="emp5")
public class Employee1 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="eid")
	private int id;
	@Column(name="efname")
	private String fName;
	@Column(name="elname")
	private String lName;
	@Column(name="eaddress")
	private String address;
	@Column(name="esalary")
	private long salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(long i) {
		this.salary = i;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", fName=" + fName + ", lName=" + lName + ", address=" + address + ", salary="
				+ salary + "]";
	}
	
	
	
}
