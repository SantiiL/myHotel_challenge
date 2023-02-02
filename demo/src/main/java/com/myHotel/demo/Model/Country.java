package com.myHotel.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Country {
    @Id
    private String countryId;
    private String countryName;
    @ManyToOne
    private Region region;
}


