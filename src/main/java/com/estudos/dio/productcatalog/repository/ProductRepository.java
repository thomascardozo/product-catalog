package com.estudos.dio.productcatalog.repository;


import com.estudos.dio.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
