package com.escuelaing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.escuelaing.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Puedes agregar métodos personalizados aquí si los necesitas
    User findByEmail(String email);
}

