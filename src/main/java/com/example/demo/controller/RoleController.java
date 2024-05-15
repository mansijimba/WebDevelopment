package com.example.demo.controller;


import com.example.demo.Entity.Role;
import com.example.demo.pojo.BookProjection;
import com.example.demo.pojo.GlobalApiResponse;
import com.example.demo.pojo.Rolepojo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleController RoleService;

    @GetMapping("/list")
    public List<BookProjection> findAll() {
       return this.RoleService.findAll();
    }
    @GetMapping("/list2")
    public List<Role> findAll2() {
        return this.RoleService.findAll2();
    }
    @PostMapping("/save")
    public GlobalApiResponse<Integer> saveRole(@RequestBody Rolepojo rolepojo) {
        GlobalApiResponse<Integer> globalApiResponse= new GlobalApiResponse<>();
        GlobalApiResponse<Integer> roleId= RoleService.saveRole(rolepojo);
        globalApiResponse.setData(roleId.getData());
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data saved successfully");

        return globalApiResponse;
    }
    @PutMapping("/update")
    public void roleUpdate(@RequestBody Rolepojo rolepojo) {
        RoleService.saveRole(rolepojo);
    }
    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id) {
        GlobalApiResponse<Integer>globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data deleted successfully");
        globalApiResponse.setData(id);
        this.RoleService.deleteById(id);
        return globalApiResponse;
    }

    private void deleteById(Integer id) {
    }

    @GetMapping("/getById/{id}")
    public Role findById(@PathVariable Integer id) {
        return this.RoleService.findById(id);
    }


}
