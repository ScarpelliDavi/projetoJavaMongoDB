package com.Davi.projetoJavaMongoDB.config;

import com.Davi.projetoJavaMongoDB.domain.Post;
import com.Davi.projetoJavaMongoDB.domain.User;
import com.Davi.projetoJavaMongoDB.repository.PostRepository;
import com.Davi.projetoJavaMongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,bob,alex));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        Post p1 = new Post(null, sdf.parse("21/03/2018").toInstant(), "Partiu Viagem", "Vou viajar pra Sao Paulo. Abracos!!", maria);
        Post p2 = new Post(null, sdf.parse("23/03/2018").toInstant(), "Bom dia", "Acordei feliz hoje", maria);

        postRepository.saveAll(Arrays.asList(p1,p2));

    }
}
