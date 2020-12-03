package com.irod.taskshoppingcart.Repository;

import com.irod.taskshoppingcart.Model.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderItems,Integer> {
}
