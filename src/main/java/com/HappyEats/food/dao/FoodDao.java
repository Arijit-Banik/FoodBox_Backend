package com.HappyEats.food.dao;

import com.HappyEats.food.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FoodDao extends JpaRepository<Food,String> {

}
