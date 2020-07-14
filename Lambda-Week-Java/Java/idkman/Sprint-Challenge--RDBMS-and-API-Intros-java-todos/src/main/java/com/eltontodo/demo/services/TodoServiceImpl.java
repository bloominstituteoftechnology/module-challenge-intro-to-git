package com.eltontodo.demo.services;

import com.eltontodo.demo.models.Todo;
import com.eltontodo.demo.repos.Todorepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService
{
    @Autowired
    private Todorepo trepo;

    @Override
    public List<Todo> findall()
    {
        List<Todo> rtnlist = new ArrayList<>();

        trepo.findAll()
                .iterator()
                .forEachRemaining(rtnlist :: add);
        return rtnlist;
    }

    @Override
    public Todo findbyId(long id)
    {
        return trepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Todo " + id + " not found"));
    }
}
