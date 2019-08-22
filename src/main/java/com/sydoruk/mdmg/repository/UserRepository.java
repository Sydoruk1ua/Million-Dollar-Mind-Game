package com.sydoruk.mdmg.repository;

import com.sydoruk.mdmg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer > {
}
