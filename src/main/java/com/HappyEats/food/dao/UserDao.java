package com.HappyEats.food.dao;

import com.HappyEats.food.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String> {
}
