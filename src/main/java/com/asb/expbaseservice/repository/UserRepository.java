package com.asb.expbaseservice.repository;

import com.asb.expbaseservice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmailId(String emailId);
}
