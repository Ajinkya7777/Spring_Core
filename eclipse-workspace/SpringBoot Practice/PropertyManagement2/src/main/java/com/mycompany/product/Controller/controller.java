package com.mycompany.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.product.DTO.PropertyDTO;
import com.mycompany.product.service.PropertyService;

@RestController // to make a Java POJO class RESTFUL
@RequestMapping("/product/api") // used to map a java class
public class controller {
	@Autowired
	private PropertyService propertyService;

	@PostMapping("/properties")
	public ResponseEntity<PropertyDTO> saveProperty(@RequestBody PropertyDTO pDTO) {

		pDTO = propertyService.saveProperty(pDTO);
		ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<PropertyDTO>(pDTO, HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping("/properties")
	public ResponseEntity<List<PropertyDTO>> getAllProperties() {
		List<PropertyDTO> listOfprops = propertyService.getallPropertyEntities();
		ResponseEntity<List<PropertyDTO>> entity = new ResponseEntity<List<PropertyDTO>>(listOfprops, HttpStatus.OK);
		return entity;
	}
	
	@PutMapping("/properties/{propertyId}")
	public ResponseEntity<PropertyDTO> updateProperty(@RequestBody PropertyDTO pDTO,@PathVariable Integer propertyId) {
		pDTO=propertyService.updateProperty(pDTO,propertyId);
		ResponseEntity<PropertyDTO> entity = new ResponseEntity<PropertyDTO>(pDTO,HttpStatus.CREATED);
		return entity;
	}
	@PatchMapping("/properties/{propertyId}")
	public ResponseEntity<PropertyDTO> updatePropertyDescription(@RequestBody PropertyDTO pDTO,@PathVariable Integer propertyId){
		pDTO = propertyService.updateProperty(pDTO, propertyId);
		ResponseEntity<PropertyDTO> entity = new ResponseEntity<PropertyDTO>(pDTO,HttpStatus.CREATED);
		return entity;
	}
	
	@DeleteMapping("/properties/delete-property/{propertyId}")
	public ResponseEntity<Void> deleteProperty(@PathVariable Integer propertyId) {
		  propertyService.deletePeroperty(propertyId);
		  ResponseEntity<Void> entity = new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		  return entity;
	}

}
