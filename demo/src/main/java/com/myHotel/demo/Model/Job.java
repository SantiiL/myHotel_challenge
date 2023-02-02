package com.myHotel.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Job {
    @Id
    private String jobId;
    private String jobTitle;
    private Double minSalary;
    private Double maxSalary;
}

