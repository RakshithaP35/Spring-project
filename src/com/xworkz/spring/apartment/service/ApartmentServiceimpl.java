package com.xworkz.spring.apartment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.apartment.dao.ApartmentDAO;
import com.xworkz.spring.apartment.entity.ApartmentEntity;

@Component
public class ApartmentServiceimpl implements ApartmentService {

		@Autowired
		private ApartmentDAO apartmentDAO;

		@Override
		public boolean validateAndSave(ApartmentEntity entity) {
			boolean apartment = false;

			if (entity != null) {
				String location = entity.getLocation();
				if (location != null && !location.isEmpty()) {
					apartment = true;
				} else {
					apartment = false;
				}
				Integer noOfFloors = entity.getNoOfFloors();
				if (noOfFloors > 5 && noOfFloors < 15) {
					apartment = true;
				} else {
					apartment = false;
				}
				Boolean liftAvailable = entity.isLiftAvailable();
				if (liftAvailable != null) {
					apartment = true;
				} else {
					apartment = false;
				}
				Double price = entity.getPrice();
				if (price > 5000 && price < 15000) {
					System.out.println("valid");
					apartment = true;
				} else {
					System.out.println("invalid");
					apartment = false;
				}

				this.apartmentDAO.save(entity);
				apartment = true;
				return apartment;

			}

			return apartment;

		}
	}

