package com.Davi.projetoJavaMongoDB.services;

import com.Davi.projetoJavaMongoDB.domain.User;
import com.Davi.projetoJavaMongoDB.repository.UserRepository;
import com.Davi.projetoJavaMongoDB.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
    }
}
