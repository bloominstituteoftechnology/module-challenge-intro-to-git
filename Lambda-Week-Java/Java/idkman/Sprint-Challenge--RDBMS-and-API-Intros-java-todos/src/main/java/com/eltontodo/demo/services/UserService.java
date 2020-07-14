package com.eltontodo.demo.services;

import com.eltontodo.demo.models.User;

import java.util.List;

public interface UserService
{
    List<User> findall();

    User findbyId();
}
