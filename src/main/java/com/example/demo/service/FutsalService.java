package com.example.demo.service;

import com.example.demo.Entity.Futsal;
import com.example.demo.pojo.Futsalpojo;

import java.util.List;
import java.util.Optional;

public interface FutsalService {
    static void save(Futsalpojo futsalpojo) {}


    List<Futsal> findAll();

    void saveData(Futsalpojo futsalpojo);

    void deleteById(int id);

    Futsal findById(int id);
}
