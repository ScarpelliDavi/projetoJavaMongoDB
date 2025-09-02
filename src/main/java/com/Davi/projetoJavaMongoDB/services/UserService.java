package com.Davi.projetoJavaMongoDB.services;

import com.Davi.projetoJavaMongoDB.domain.User;
import com.Davi.projetoJavaMongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
