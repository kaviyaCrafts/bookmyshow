package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.LogIn;
import com.example.BookMyShow.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogInRepository extends JpaRepository<LogIn,Long> {
        LogIn findByEmail(String email);

}

