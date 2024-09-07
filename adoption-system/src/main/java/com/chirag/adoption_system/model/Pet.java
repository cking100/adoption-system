package com.chirag.adoption_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String breed;
    private String type;
    private String description;
    private int age;
    private String image_url;
    private  boolean adopted;
    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;

}
