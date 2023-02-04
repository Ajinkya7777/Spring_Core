package com.mycompany.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.product.DTO.PropertyDTO;
import com.mycompany.product.entity.PropertyEntity;
import com.mycompany.product.repository.PropertyRepository;
import com.mycompany.product.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {
	
	@Autowired
	PropertyRepository propertyRepository;

	@Override
	public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
		
		
		//PropertyEntity pe =  (PropertyEntity) propertyDTO;  can't do this directly
		
		PropertyEntity pe = new PropertyEntity();
		pe.setAddress(propertyDTO.getAddress());
		pe.setDescription(propertyDTO.getDescription());
		pe.setOwnerEmail(propertyDTO.getOwnerEmail());
		pe.setOwnerName(propertyDTO.getOwnerName());
		pe.setPrice(propertyDTO.getPrice());
		pe.setTitle(propertyDTO.getTitle());
		//pe.getID();  auto generate no need
		
		propertyRepository.save(pe);
		
		return null;
	}

}
