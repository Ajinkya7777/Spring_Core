package com.mycompany.product.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.product.DTO.PropertyDTO;
import com.mycompany.product.converter.ConverterClass;
import com.mycompany.product.entity.PropertyEntity;
import com.mycompany.product.repository.PropertyRepository;
import com.mycompany.product.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;

	@Autowired
	private ConverterClass converter;

	@Override
	public PropertyDTO saveProperty(PropertyDTO propertyDTO) {

		// PropertyEntity pe = (PropertyEntity) propertyDTO; can't do this directly

		PropertyEntity pe = converter.dtoToEntity(propertyDTO);

		pe=propertyRepository.save(pe);

		PropertyDTO dto = converter.entityToDTO(pe);

		return dto;
	}

	@Override
	public List<PropertyDTO> getallPropertyEntities() {
		List<PropertyEntity> listOfProps=(List<PropertyEntity>)propertyRepository.findAll();
		var listOfDTO = new ArrayList<PropertyDTO>();
		for (PropertyEntity propertyEntity : listOfProps) {
			PropertyDTO dto=converter.entityToDTO(propertyEntity);
			listOfDTO.add(dto);
		}
		return listOfDTO;
	}

	@Override
	public PropertyDTO updateProperty(PropertyDTO propertyDTO, Integer propertyId) {
					Optional<PropertyEntity> optEn=	propertyRepository.findById(propertyId);
					PropertyDTO dto=null;
					if (optEn.isPresent()) {
						PropertyEntity pe = optEn.get();
						//pe.setAddress(propertyDTO.getAddress());
						pe.setDescription(propertyDTO.getDescription());
						//pe.setOwnerEmail(propertyDTO.getOwnerEmail());
						//pe.setOwnerName(propertyDTO.getOwnerName());
						//pe.setPrice(propertyDTO.getPrice());
						//pe.setTitle(propertyDTO.getTitle());
						propertyRepository.save(pe);
						 dto = converter.entityToDTO(pe);
						
					}
		return dto;
	}

	@Override
	public void deletePeroperty(Integer propertyId) {
		
		propertyRepository.deleteById(propertyId);
	}

}
