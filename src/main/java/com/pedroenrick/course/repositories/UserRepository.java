package com.pedroenrick.course.repositories;

import com.pedroenrick.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
