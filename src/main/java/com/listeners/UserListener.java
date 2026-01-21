package com.listeners;

import java.time.LocalDate;

import jakarta.persistence.PrePersist;

public class UserListener {
      
    @PrePersist
    public void prePersist(User user) {
        user.setCreatedAt(LocalDate.now());
    }
}
