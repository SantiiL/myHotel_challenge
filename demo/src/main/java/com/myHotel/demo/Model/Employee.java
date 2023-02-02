package com.myHotel.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Employee {
    @Id
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;
    @ManyToOne
    private Job job;
    private Double salary;
    private Double commissionPct;
    @ManyToOne
    private Employee manager;
    @ManyToOne
    private Department department;
}

