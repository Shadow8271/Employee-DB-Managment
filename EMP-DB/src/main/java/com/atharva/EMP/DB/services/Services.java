package com.atharva.EMP.DB.services;

import com.atharva.EMP.DB.Demoemp;
import com.atharva.EMP.DB.entities.Employee;
import com.atharva.EMP.DB.repositories.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class Services {
    @Autowired
    static Repositories repositories;

//adding emp data through json
    public void addempdata(Demoemp demoemp){
        Employee e1= new Employee();
        e1.setEid(demoemp.getId());
        e1.setName(demoemp.getName());
        e1.setDesignation(demoemp.getDesignation());
        e1.setSalary(demoemp.getSalary());

        repositories.save(e1);
    }


//Getting all employess
    public List<Employee> allemp(){
        return repositories.findAll();
    }

    //getapi adding employees
    public Employee getapi(int id, String name, String designation, int salary){
        Employee e1= new Employee(id,name,designation,salary);
        repositories.save(e1);
        return e1;
    }
public static Employee findbyid(int id){
        return (Employee) repositories.findAllById(Collections.singleton(id));
}

public boolean deleteemp(int id){
        repositories.deleteAllById(Collections.singleton(id));
        return true;
}










    //Test api only
    //Last checked can save data
public void test(){
        Employee e2=new Employee();
        e2.setEid(133);
        e2.setName("bantya");
        e2.setSalary(500);
        e2.setDesignation("abc");

        repositories.save(e2);

}


}
