package com.eltontodo.demo.services;

import com.eltontodo.demo.models.Todo;

import java.util.List;

public interface TodoService
{
    List<Todo> findall();

    Todo findbyId();
}
