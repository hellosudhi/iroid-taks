package com.irod.taskshoppingcart;

import com.irod.taskshoppingcart.Model.User;
import com.irod.taskshoppingcart.Repository.ProductRepo;
import com.irod.taskshoppingcart.Repository.UserRepo;
import com.irod.taskshoppingcart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TaskShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskShoppingCartApplication.class, args);

	}

}
