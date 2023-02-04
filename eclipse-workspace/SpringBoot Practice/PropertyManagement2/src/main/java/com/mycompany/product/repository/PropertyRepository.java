package com.mycompany.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.product.entity.PropertyEntity;

public interface PropertyRepository extends CrudRepository<PropertyEntity, Integer> {

}
