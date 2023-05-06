package com.example.skblabspringboot;

import com.example.skblabspringboot.dto.UserDatabaseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDatabaseDto, Long> {
}
