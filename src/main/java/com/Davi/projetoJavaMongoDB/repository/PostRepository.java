package com.Davi.projetoJavaMongoDB.repository;

import com.Davi.projetoJavaMongoDB.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
