package org.example;

public class User
{
        String username;
        String password;
        String role; // ADMIN or CUSTOMER

        public User(String username, String password, String role) {
            this.username = username;
            this.password = password;
            this.role = role;
        }
    }
