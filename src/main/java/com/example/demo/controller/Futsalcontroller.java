package com.example.demo.controller;

import com.example.demo.Entity.Futsal;
import com.example.demo.pojo.Futsalpojo;
import com.example.demo.pojo.GlobalApiResponse;
import com.example.demo.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Futsal")
@RequiredArgsConstructor

public class Futsalcontroller {
    private final   FutsalService futsalService;

    @GetMapping("/list")
    public <globalApiResponse> List<Futsal> findAll(){
        GlobalApiResponse<List<Futsal>> globalApiResponse = new GlobalApiResponse<List<Futsal>>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setData(futsalService.findAll());
        globalApiResponse.setMessage("data saved successfully");
        return (List<Futsal>) globalApiResponse;
    }
    @PostMapping("/save")
    public GlobalApiResponse<String> futsal(@RequestBody Futsalpojo futsalpojo) {
        GlobalApiResponse<String> globalApiResponse = new GlobalApiResponse<String>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data saved successfully");
        globalApiResponse.setData("saved");
        FutsalService.save(futsalpojo);
        return globalApiResponse;
    }

    @PutMapping("/update")
    public void futsalUpdate(@RequestBody Futsalpojo futsalpojo) {
        FutsalService.save(futsalpojo);
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id) {
        GlobalApiResponse<Integer>globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data deleted successfully");
        globalApiResponse.setData(id);
        this.futsalService.deleteById(id);
        return globalApiResponse;

    }
    @GetMapping("/getById/{id}")
    public Futsal findById(@PathVariable Integer id) {
        return this.futsalService.findById(id);
    }
}
