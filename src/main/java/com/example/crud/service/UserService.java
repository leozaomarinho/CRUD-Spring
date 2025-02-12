package com.example.crud.service;

import java.util.List;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
//camada intermediaria entre o controller e o repository
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public  List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(null);
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(id){
        userRepository.deleteById(id);
    }

}
