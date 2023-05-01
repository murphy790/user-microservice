package com.example.usermicroservice.repository;

import com.example.usermicroservice.entities.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetail, Long> {
}
