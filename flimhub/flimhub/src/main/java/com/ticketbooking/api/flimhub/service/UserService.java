package com.ticketbooking.api.flimhub.service;

import com.ticketbooking.api.flimhub.model.User;
import com.ticketbooking.api.flimhub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


        @Autowired
        private UserRepository userRepository;

        public List<User> getAllUsers() {
            return (List<User>) userRepository.findAll();

        }

        public User getUserById(Long id){
            return userRepository.findById(id).get();
        }


        public User createUser(User user) {
            return  userRepository.save(user);
        }


}


