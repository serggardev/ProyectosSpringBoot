package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface UserRepository extends  JpaRepository<User, Long> {

    //Métodos de consulta personalizados, estos serán implementados en la implementación
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
    User findByUserName(String userName);


}
