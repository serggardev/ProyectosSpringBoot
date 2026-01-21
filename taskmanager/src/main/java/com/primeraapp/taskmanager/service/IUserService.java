package com.primeraapp.taskmanager.service;

import com.primeraapp.taskmanager.dto.CreateUserRequest;
import com.primeraapp.taskmanager.model.User;


public interface IUserService {

    User createUser(CreateUserRequest request);
    

}
