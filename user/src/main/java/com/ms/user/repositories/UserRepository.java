package com.ms.user.repositories;

import java.util.UUID;

import com.ms.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
