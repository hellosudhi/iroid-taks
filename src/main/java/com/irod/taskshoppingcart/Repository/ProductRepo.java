package com.irod.taskshoppingcart.Repository;

import com.irod.taskshoppingcart.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String catogory);
}
