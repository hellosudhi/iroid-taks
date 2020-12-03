package com.irod.taskshoppingcart.Service;

import com.irod.taskshoppingcart.Model.OrderItems;
import com.irod.taskshoppingcart.Model.Product;
import com.irod.taskshoppingcart.Repository.OrderRepo;
import com.irod.taskshoppingcart.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    @Autowired
    OrderRepo orderRepo;

    public List<Product> findAllProduct() {
        return productRepo.findAll();
    }
    public List<Product> findProductByCatogory(String catogory){
        return productRepo.findByCategory(catogory);
    }

    public void saveProduct(List<Product> products) {
        productRepo.saveAll(products);
    }
    public OrderItems placeOrder(OrderItems orderItems){
        return orderRepo.save(orderItems);
    }
    public OrderItems updateStatus(int id,String status){
        OrderItems items = orderRepo.findById(id).orElseThrow();
        items.setStatus(status);
        return orderRepo.save(items);
    }

}
