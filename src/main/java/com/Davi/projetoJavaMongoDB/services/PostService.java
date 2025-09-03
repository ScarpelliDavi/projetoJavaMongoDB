package com.Davi.projetoJavaMongoDB.services;

import com.Davi.projetoJavaMongoDB.domain.Post;
import com.Davi.projetoJavaMongoDB.domain.User;
import com.Davi.projetoJavaMongoDB.repository.PostRepository;
import com.Davi.projetoJavaMongoDB.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
    }
}
