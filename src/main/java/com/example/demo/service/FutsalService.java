package com.example.demo.service;

import com.example.demo.Entity.Futsal;
import com.example.demo.pojo.Futsalpojo;

import java.util.List;
import java.util.Optional;

public interface FutsalService {
    void saveData(Futsalpojo futsalpojo);
    List<Futsal> findAll();

    void deleteById(int id);

    Futsal findById(int id);
}
