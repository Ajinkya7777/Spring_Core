package com.mycompany.product.service;

import java.util.List;

import com.mycompany.product.DTO.PropertyDTO;

public interface PropertyService {

	PropertyDTO saveProperty(PropertyDTO propertyDTO);
	List<PropertyDTO> getallPropertyEntities();
	PropertyDTO updateProperty(PropertyDTO pDTO, Integer propertyId);
	void deletePeroperty(Integer propertyId);
}
