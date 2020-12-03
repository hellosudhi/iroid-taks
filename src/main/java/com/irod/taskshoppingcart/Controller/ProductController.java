package com.irod.taskshoppingcart.Controller;

import com.irod.taskshoppingcart.Model.Product;
import com.irod.taskshoppingcart.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/all")
    @ResponseBody
    public List<Product> getAllProduct(){
        return productService.findAllProduct();
    }
    @GetMapping("/category/{category}")
    @ResponseBody
    public List<Product> getProductByCategory(@PathVariable("category") String category){
        return productService.findProductByCatogory(category);
    }
}
