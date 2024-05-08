package com.example.demo.controller;

import com.example.demo.Entity.Futsal;
import com.example.demo.pojo.Futsalpojo;
import com.example.demo.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@RequiredArgsConstructor

public class Futsalcontroller {
    private Futsalcontroller FutsalService;

    @GetMapping("/list")
    public <globalApiResponse> List<Futsal> findAll(){
        GlobalApiResponse<List<Futsal>> globalApiResponse = new globalApiResponse<List<Futsal>>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setData(FutsalService.findAll());
        globalApiResponse.setMessage("data saved successfully");
        return (List<Futsal>) globalApiResponse;
    }
    @PostMapping("/save")
    public GlobalApiResponse<String> futsal(@RequestBody Futsalpojo futsalpojo) {
        GlobalApiResponse<String> globalApiResponse = new GlobalApiResponse<String>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data saved successfully");
        globalApiResponse.setData("saved");
        FutsalService.saveData(Futsalpojo);
        return globalApiResponse;
    }

    @PutMapping("/update")
    public void futsalUpdate(@RequestBody Futsalpojo futsalpojo) {
        FutsalService.saveData(Futsalpojo);
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id) {
        GlobalApiResponse<Integer>globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data deleted successfully");
        globalApiResponse.setData(id);
        this.FutsalService.delete(id);
        return globalApiResponse;

    }
    @GetMapping("/getById/{id}")
    public Optional<Futsal> findById(@PathVariable int id) {
        return this.FutsalService.findById(id);
    }
}
