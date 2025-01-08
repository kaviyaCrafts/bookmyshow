package com.example.BookMyShow.Service;


import com.example.BookMyShow.Model.User;
import com.example.BookMyShow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class UserService {
    @Autowired
    public UserRepository Repository;

    public User create(User data){
        return Repository.save(data);
    }

    public List<User> createAll(List<User> data){
       return Repository.saveAll(data);
    }

    public List<User> getAll(){
        return Repository.findAll();
    }


    public Optional<User> getById(long id){ return Repository.findById(id);}
    public Optional<User> getByEmail(String email){
        return Repository.findByEmail(email);
   }



    public User update(long id, User data) {
        Optional<User> existingUser = Repository.findById(id);
        if (existingUser.isPresent()) {
            User oldUser = existingUser.get();
            oldUser.setFirst_name(data.getFirst_name());
            oldUser.setLast_name(data.getLast_name());
            oldUser.setEmail(data.getEmail());
            oldUser.setPhone_number(data.getPhone_number());
            oldUser.setPassword(data.getPassword());
            oldUser.setAddress(data.getAddress());
            oldUser.setIs_verified(data.is_verified());
            return Repository.save(oldUser); // Return the updated User object
        } else {
            return null; // Return null or throw an exception if user not found
        }
    }


    public String delete(long id){
        Repository.deleteById(id);
        return "deleted";
    }

    public String deleteByEmail(String email){
        Repository.findByEmail(email);
             return "Deleted";
    }


//    public List<User> getAllUser() {
//        return Repository.findAll();
//    }
}
