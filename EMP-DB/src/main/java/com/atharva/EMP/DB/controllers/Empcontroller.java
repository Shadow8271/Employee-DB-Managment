package com.atharva.EMP.DB.controllers;

import com.atharva.EMP.DB.Demoemp;
import com.atharva.EMP.DB.entities.Employee;
import com.atharva.EMP.DB.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.Set;

@RestController
public class Empcontroller {

    @Autowired
    private Services services;
//Get all empoyess
    @GetMapping("/getallemployee")
    public List<Employee> getemployee(){
List<Employee> emp= services.allemp();
        return emp;
    }

//Create API 1
    @PostMapping("/addemp")
    public void addemp(@RequestBody Demoemp demoemp){
        services.addempdata(demoemp);
    }
//Adding data using get API
    @GetMapping("/getapi")
    public Employee getapi(@RequestParam(name="id")int id, @RequestParam(name="name") String name, @RequestParam(name="designation")String designation,@RequestParam(name="salary")int salary){

        return services.getapi(id,name,designation,salary);
    }

    // GET API find by id
    @GetMapping("/findbyid")
    public Employee findbyid(@RequestParam (name="id") int id){
        return Services.findbyid(id);
    }

    //PutMapping



    @DeleteMapping("/deleteemp/{id}")
    public Boolean test(@PathVariable(name = "id") int id){

        return services.deleteemp(id);
    }





    @GetMapping("/test/{nam}")
    public String test(@PathVariable(name = "nam") String nam){
       services.test();
        return nam;
    }



}
