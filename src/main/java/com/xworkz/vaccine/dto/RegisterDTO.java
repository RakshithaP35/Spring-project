package com.xworkz.vaccine.dto;

public class RegisterDTO {
	private String userNmae;
	private String email;
	private String password;
	private String comfirmPassword;
	private String phoneNo;
	private String vaccineType;
	private String aadharNo;
	private String gender;
	
	public RegisterDTO() {
		System.out.println("created bean");
	}
	
	public RegisterDTO(String userNmae, String email, String password, String comfirmPassword, String phoneNo,
			String vaccineType, String aadharNo, String gender) {
		super();
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
		return "RegisterDTO [userNmae=" + userNmae + ", email=" + email + ", password=" + password
				+ ", comfirmPassword=" + comfirmPassword + ", phoneNo=" + phoneNo + ", vaccineType=" + vaccineType
				+ ", aadharNo=" + aadharNo + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharNo == null) ? 0 : aadharNo.hashCode());
		result = prime * result + ((comfirmPassword == null) ? 0 : comfirmPassword.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + ((userNmae == null) ? 0 : userNmae.hashCode());
		result = prime * result + ((vaccineType == null) ? 0 : vaccineType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisterDTO other = (RegisterDTO) obj;
		if (aadharNo == null) {
			if (other.aadharNo != null)
				return false;
		} else if (!aadharNo.equals(other.aadharNo))
			return false;
		if (comfirmPassword == null) {
			if (other.comfirmPassword != null)
				return false;
		} else if (!comfirmPassword.equals(other.comfirmPassword))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (userNmae == null) {
			if (other.userNmae != null)
				return false;
		} else if (!userNmae.equals(other.userNmae))
			return false;
		if (vaccineType == null) {
			if (other.vaccineType != null)
				return false;
		} else if (!vaccineType.equals(other.vaccineType))
			return false;
		return true;
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
