package com.mycompany.product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.product.DTO.PropertyDTO;
import com.mycompany.product.service.PropertyService;

@RestController  //to make a Java POJO class RESTFUL 
@RequestMapping("/product/api") // used to map a java class 
public class controller {
	@Autowired
	PropertyService propertyService;
	@PostMapping("/properties")
	public PropertyDTO saveProperty(@RequestBody PropertyDTO pDTO) {
		
		propertyService.saveProperty(pDTO);
		return pDTO;
	}
	
	
	
	
}