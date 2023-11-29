package com.demo.food.model;


import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String foodName;
    private String foodType;
    @ElementCollection(targetClass=String.class)
    private List<String> foodMaterials;
    private String recipes;
    private String foodPic;
}
