package com.curdSpring.beStore.services;

import com.curdSpring.beStore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Integer> {

}
