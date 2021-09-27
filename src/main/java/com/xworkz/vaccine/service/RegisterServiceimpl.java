package com.xworkz.vaccine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vaccine.dao.RegisterDAO;
import com.xworkz.vaccine.dto.RegisterDTO;
import com.xworkz.vaccine.entity.RegisterEntity;

@Component
public class RegisterServiceimpl implements RegisterService {


	@Autowired
	private RegisterDAO registerDAO;

	
	public RegisterServiceimpl() {
		System.out.println("service");
	}

	public boolean validateRegisterDTO(RegisterDTO registerDTO) {
		boolean flag = false;
		if (registerDTO != null) {
			if (!registerDTO.getUserNmae().isEmpty() && registerDTO.getUserNmae() != null) {
				flag = true;
			}
			if (!registerDTO.getPassword().isEmpty() && registerDTO.getPassword() != null) {
				flag = true;
			}
			if (!registerDTO.getComfirmPassword().isEmpty() && registerDTO.getComfirmPassword() != null) {
				flag = true;
			}
			if (!registerDTO.getEmail().isEmpty() && registerDTO.getEmail() != null) {
				flag = true;
			}
			if (!registerDTO.getPhoneNo().isEmpty() && registerDTO.getPhoneNo()!= null) {
				flag = true;
			}
			if (!registerDTO.getGender().isEmpty() && registerDTO.getGender() != null) {
				flag = true;
			}
			if (!registerDTO.getAadharNo().isEmpty() && registerDTO.getAadharNo()!= null) {
				flag = true;
			}
			if (!registerDTO.getVaccineType().isEmpty() && registerDTO.getVaccineType()!= null) {
				flag = true;
			}

		}
		if (flag) {
			RegisterEntity registerEntity = new RegisterEntity();
			registerEntity.setUserNmae(registerDTO.getUserNmae());
			registerEntity.setPassword(registerDTO.getPassword());
			registerEntity.setComfirmPassword(registerDTO.getComfirmPassword());
			registerEntity.setEmail(registerDTO.getEmail());
			registerEntity.setPhoneNo(registerDTO.getPhoneNo());
			registerEntity.setAadharNo(registerDTO.getAadharNo());
			registerEntity.setVaccineType(registerDTO.getVaccineType());
			registerEntity.setGender(registerDTO.getGender());

			this.registerDAO.saveregisterDTO(registerEntity);
			return flag;
		} else {
			return flag;
		}
	}
}
