package com.example.BookMyShow.Controller;

import com.example.BookMyShow.Model.User;
import com.example.BookMyShow.Repository.UserRepository;
import com.example.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService Service;

    @PostMapping("/create")
    public User createUser(@RequestBody User data){
        return Service.create(data);
    }

    @PostMapping("/createAll")
    public List<User> createMultipleUser(@RequestBody List<User> data){
        return Service.createAll(data);
    }

    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return Service.getAll();
    }

    @GetMapping("/getById{id}")
    public Optional<User> getById(@PathVariable long id){ return Service.getById(id); }
    @GetMapping("/getByEmail/{email}")
    public Optional<User> getByEmail(@PathVariable String email){
        return Service.getByEmail(email);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody User data) {
        User updatedUser = Service.update(id, data);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser); // Return updated user with HTTP 200 status
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // Return HTTP 404 if user not found
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser (@PathVariable long id){
        return Service.delete(id);
    }

    @DeleteMapping("/deleteByEmail/{email}")
    public String deleteUserByEmail (@PathVariable String email){
        return Service.deleteByEmail(email);
    }

}
