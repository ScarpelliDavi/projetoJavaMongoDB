package com.Davi.projetoJavaMongoDB.repository;

import com.Davi.projetoJavaMongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
