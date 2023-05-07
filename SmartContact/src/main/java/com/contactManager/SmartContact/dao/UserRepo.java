package com.contactManager.SmartContact.dao;

import com.contactManager.SmartContact.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}

