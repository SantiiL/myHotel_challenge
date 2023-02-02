package com.myHotel.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class JobHistory {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private Job job;
    @ManyToOne
    private Department department;
}
