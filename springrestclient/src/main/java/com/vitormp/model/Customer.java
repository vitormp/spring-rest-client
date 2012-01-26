package com.vitormp.model;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("customer")
public class Customer {

	private Long id;
	private String name;
	private Integer age;
	private Date birthDate;
	
	public Customer(){}
	
	public Customer(Long id, String name, Integer age, Date birthDate){
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
