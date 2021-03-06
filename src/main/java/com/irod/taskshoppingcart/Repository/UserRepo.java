package com.irod.taskshoppingcart.Repository;

import com.irod.taskshoppingcart.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    Optional<User> findByUsernameAndPassword(String username, String password);
}
