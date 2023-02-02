package com.myHotel.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Department {
    @Id
    private Long departmentId;
    private String departmentName;
    @ManyToOne
    private Employee manager;
    @ManyToOne
    private Location location;
}

