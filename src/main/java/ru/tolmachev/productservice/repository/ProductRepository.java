package ru.tolmachev.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.tolmachev.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
