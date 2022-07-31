package com.HappyEats.food.dao;

import com.HappyEats.food.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
