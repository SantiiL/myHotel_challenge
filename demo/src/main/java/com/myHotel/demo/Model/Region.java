package com.myHotel.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Region {
    @Id
    private Long regionId;
    private String regionName;
}
