package com.example.BookMyShow.Service;

import com.example.BookMyShow.Model.LogIn;
import com.example.BookMyShow.Repository.LogInRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogInService {
    @Autowired
    private LogInRepository Repository;

    public LogIn createUser(@Valid LogIn user) {
        return Repository.save(user);
    }

    public List<LogIn> getAllUsers() {
        return Repository.findAll();
    }

    public Optional<LogIn> getUserById(Long id) {
        return Repository.findById(id);
    }

    public LogIn updateUser(Long id, @Valid LogIn user) {
        if (Repository.existsById(id)) {
            user.setId(id);
            return Repository.save(user);
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        if (Repository.existsById(id)) {
            Repository.deleteById(id);
            return true;
        }
        return false;
    }

    public LogIn getUserByEmail(String email) {
        return Repository.findByEmail(email);
    }


}
