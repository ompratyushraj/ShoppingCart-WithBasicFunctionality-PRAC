package com.telusko.practice.ecom_proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private int quantity;
    private boolean available;
    private Date release_date; // ErrorInMyCase : SQL format prefers the entity creation in snake case type to be presented, but I'm most probably do the camel case which is giving me error in creating the product and releaseDate column in table.
}
