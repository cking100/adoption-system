package com.chirag.adoption_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shelter")
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String location;
    private String email;
    private String last;
}
