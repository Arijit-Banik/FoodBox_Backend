package com.HappyEats.food.controller;

import com.HappyEats.food.dao.UserDaoImpl;
import com.HappyEats.food.model.Login;
import com.HappyEats.food.model.User;
import com.HappyEats.food.utility.StrongAES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private UserDaoImpl userDao;


    @RequestMapping("/login")
    public Login showLogin() {
        return new Login();
    }

    @PostMapping("/login")
    public User loginProcess(@RequestBody Login login, Model model) {
        User user = null;
        user = userDao.validateUser(login);
        if(user!=null)
        user.setPassword(null);
        return user;
    }

    @RequestMapping("/xx")
    private String xx(){
        return new StrongAES().encrypt("");
    }

}
