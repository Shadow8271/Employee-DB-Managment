package com.atharva.EMP.DB.repositories;

import com.atharva.EMP.DB.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositories extends JpaRepository<Employee,Integer> {

}
