package com.service;

import org.springframework.stereotype.Service;


public interface IUserService {

    UserResponse createUser(CreateUserRequest createUserRequest);
    

}
