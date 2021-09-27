package com.xworkz.vaccine.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="vaccine_table")
public class RegisterEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="r_id")
	private int id;
	
	@Column(name="r_userNmae")
	private String userNmae;
	
	@Column(name="r_email")
	private String email;
	
	@Column(name="r_password")
	private String password;
	
	@Column(name="r_comfirmPassword")
	private String comfirmPassword;
	
	@Column(name="r_phoneNo")
	private String phoneNo;
	
	@Column(name="r_vaccineType")
	private String vaccineType;
	
	@Column(name="r_aadharNo")
	private String aadharNo;
	
	@Column(name="r_gender")
	private String gender;
	
	public RegisterEntity() {
		// TODO Auto-generated constructor stub
	}

	public RegisterEntity(int id, String userNmae, String email, String password, String comfirmPassword,
			String phoneNo, String vaccineType, String aadharNo, String gender) {
		super();
		this.id = id;
		this.userNmae = userNmae;
		this.email = email;
		this.password = password;
		this.comfirmPassword = comfirmPassword;
		this.phoneNo = phoneNo;
		this.vaccineType = vaccineType;
		this.aadharNo = aadharNo;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "RegisterEntity [id=" + id + ", userNmae=" + userNmae + ", email=" + email + ", password=" + password
				+ ", comfirmPassword=" + comfirmPassword + ", phoneNo=" + phoneNo + ", vaccineType=" + vaccineType
				+ ", aadharNo=" + aadharNo + ", gender=" + gender + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserNmae() {
		return userNmae;
	}

	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComfirmPassword() {
		return comfirmPassword;
	}

	public void setComfirmPassword(String comfirmPassword) {
		this.comfirmPassword = comfirmPassword;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	
}


