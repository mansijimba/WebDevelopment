package com.example.demo.service.impl;

import com.example.demo.Entity.Futsal;
import com.example.demo.pojo.Futsalpojo;
import com.example.demo.repo.Futsalrepository;
import com.example.demo.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public  class FutsalServiceimpl implements FutsalService {
    private final Futsalrepository futsalrepository;
    @Override
    public List<Futsal> findAll(){
        return futsalrepository.findAll();
    }

    @Override
    public void saveData(Futsalpojo futsalpojo) {
        Futsal futsal = new Futsal();
        futsal.setId(futsalpojo.getId());
        futsal.setGroundName(futsalpojo.getGroundname());

        futsalrepository.save(futsal);
    }

    @Override
    public void deleteById(int id) {
        futsalrepository.deleteById(id);
    }
}
