package com.irod.taskshoppingcart.Controller;

import com.irod.taskshoppingcart.Model.Product;
import com.irod.taskshoppingcart.Model.User;
import com.irod.taskshoppingcart.Service.ProductService;
import com.irod.taskshoppingcart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@CrossOrigin("*")
public class HomeController {
    @Autowired
    UserService service;
    @Autowired
    ProductService productService;
    @GetMapping("/")
    @ResponseBody
    public void home(){
        if(service.findAllUser().isEmpty())
        {
            User u1 = new User();
            User u2 = new User();
            User u3 = new User();
            u1.setUsername("admin");
            u1.setPassword("admin");
            u1.setType("admin");
            u2.setUsername("user");
            u2.setPassword("user");
            u2.setType("user");
            u3.setUsername("geust");
            u3.setPassword("geust");
            u3.setType("geust");
            List<User> user = Arrays.asList(u1,u2,u3);
            service.saveAll(user);
        }
        if(productService.findAllProduct().isEmpty()) {
            Product p1 = new Product();
            Product p2 = new Product();

            Product p3 = new Product();
            Product p4 = new Product();

            Product p5 = new Product();
            Product p6 = new Product();

            p1.setItemname("Dell Xps");
            p1.setPrice("30000");
            p1.setCategory("computer");
            p1.setImageUrl("https://bit.ly/33DOkdV");


            p2.setItemname("Apple M1");
            p2.setPrice("140000");
            p2.setCategory("computer");
            p2.setImageUrl("https://bit.ly/39zDQ3d");

            p3.setItemname("Yonex");
            p3.setPrice("2300");
            p3.setCategory("sports");
            p3.setImageUrl("https://bit.ly/37yxnD4");

            p4.setItemname("Li-Ning ");
            p4.setPrice("2000");
            p4.setCategory("sports");
            p4.setImageUrl("https://bit.ly/3mxHkH4");

            p5.setItemname("");
            p5.setPrice("450");
            p5.setCategory("Cloths");
            p5.setImageUrl("https://bit.ly/33DOiTl");

            p5.setItemname("Striped Men Hooded Neck Red, Black T-Shirt");
            p5.setPrice("450");
            p5.setCategory("Cloths");
            p5.setImageUrl("https://bit.ly/36vBDUt");

            p6.setItemname("Polka Print Daily Wear Georgette Saree  (Yellow)");
            p6.setPrice("500");
            p6.setCategory("Cloths");
            p6.setImageUrl("https://bit.ly/37pEuO1");

            List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6);
            productService.saveProduct(products);
        }
    }
}
