package com.Davi.projetoJavaMongoDB.config;

import com.Davi.projetoJavaMongoDB.domain.User;
import com.Davi.projetoJavaMongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User u1 = new User(null, "Maria Carolina", "mariaCarolina@gmail.com");
        User u2 = new User(null, "Joao da Silva", "joaoSilva@gmail.com");
        User u3 = new User(null, "Carlos Souza", "carlosSouza@gmail.com");
        User u4 = new User(null, "Jorge dos Santos", "jorge@gmail.com");

        userRepository.saveAll(Arrays.asList(u1,u2,u3,u4));

    }
}
