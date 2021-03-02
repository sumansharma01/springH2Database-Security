package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String all(){
        return ("<h1>Unauthorized</h1>");
    }
    @GetMapping("/user")
    public String allUsers(){
        return ("<h1>Users</h1>");
    }
    @GetMapping("/admin")
    public String allAdmins(){
        return ("<h1>Admin</h1>");
    }
}
