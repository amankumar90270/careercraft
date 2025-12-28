package com.resume.ai_resume_builder.repository;

import com.resume.ai_resume_builder.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    // Spring Data MongoDB will automatically create a query for this method
    // It will find a user by their email address
    Optional<User> findByEmail(String email);
}