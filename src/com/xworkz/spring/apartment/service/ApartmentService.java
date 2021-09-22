package com.xworkz.spring.apartment.service;

import com.xworkz.spring.apartment.entity.ApartmentEntity;

public interface ApartmentService {

	boolean validateAndSave(ApartmentEntity entity);
}
