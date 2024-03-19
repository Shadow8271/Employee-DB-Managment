package com.atharva.EMP.DB.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EmployeeDatabase")
@Entity
public class Employee {
   @Id
    private Integer eid;
          private String name;
          private String Designation;
          private Integer salary;

}
