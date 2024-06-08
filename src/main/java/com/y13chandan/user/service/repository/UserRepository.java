package com.y13chandan.user.service.repository;

import com.y13chandan.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
