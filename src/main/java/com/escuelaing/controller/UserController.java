package com.escuelaing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.escuelaing.model.User;
import com.escuelaing.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/blackjack")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/Users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    
    @PostMapping("/register")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New user is added";

    }
    // Nuevo método para verificar que el controlador funciona correctamente
    @GetMapping("/test")
        public String testMessage() {
            return "The application is running!";
        }
}






    // Otros métodos (actualizar, eliminar) pueden ser añadidos aquí


