package com.example.learning.Service;

import org.springframework.stereotype.Service;

import com.example.learning.Model.UserModel;
import com.example.learning.Repoistory.UserRepoistory;

@Service
public class UserService {


        private final UserRepoistory userRepoistory;
    
        public UserService(UserRepoistory userRepoistory) {
            this.userRepoistory = userRepoistory;
        }
    
        public UserModel registerUser(String username, String password, String role) {
            if (username == null || password == null) {
                throw new IllegalArgumentException("Username and password cannot be null");
            }
    
            // Additional validation logic if needed
    
            UserModel userModel = new UserModel();
            userModel.setUsername(username);
            userModel.setPassword(password);  // Consider hashing the password
            userModel.setRole(role);
    
            return userRepoistory.save(userModel);
        }
    
        public UserModel authenticate(String username, String password) {
            return userRepoistory.findByUsernameAndPassword(username, password)
                    
                    .filter(user -> "ROLE_USER".equals(user.getRole()))  // Adjust role check as needed
                    .orElse(null);
        }
        
    }
    
