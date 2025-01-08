package com.example.BookMyShow.Model;


import jakarta.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String first_name;
    public String last_name;
    public String email;
    public long Phone_number;
    public String password;
    public String address;
    public boolean is_verified;

    public User() {
        // No-argument constructor
    }
    public User(long id, String first_name, String last_name, String email, long phone_number, String password, String address, boolean is_verified) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        Phone_number = phone_number;
        this.password = password;
        this.address = address;
        this.is_verified = is_verified;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", Phone_number=" + Phone_number +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", is_verified=" + is_verified +
                '}';
    }

//    public User(long id, String first_name, String last_name, String email, long phone_number, String password, String address, boolean is_verified){
//        this.id=id;
//        this.first_name=first_name;
//        this.last_name=last_name;
//        this.email=email;
//        this.Phone_number=phone_number;
//        this.password=password;
//        this.address=address;
//        this.is_verified=is_verified;
//    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(long phone_number) {
        Phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(Boolean is_verified) {
        this.is_verified = is_verified;
    }

    public Boolean is_verified() {
        return is_verified;
    }
}
