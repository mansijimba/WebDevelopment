package com.example.demo.service;


import com.example.demo.Entity.Role;
import com.example.demo.pojo.RoleProjection;
import com.example.demo.pojo.Rolepojo;

import java.util.List;

public interface RoleService {
    static List<RoleProjection> findAll() {
        return null;
    }

    List<Role> findAll2();

    void saveData(Rolepojo rolepojo);

    void deleteById(int id);

    Role findById(int id);
}
