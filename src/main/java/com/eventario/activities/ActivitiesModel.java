package com.eventario.activities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name ="activity")
public class ActivitiesModel {
    public ActivitiesModel(UUID uuid, Long id, String name, String description) {
        this.uuid = UUID.randomUUID();
        Id = id;
        this.name = name;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "uuid", unique = true, updatable = false,nullable = false)
    UUID uuid;

    @Column(name = "name")
    String name;

    @Column(name ="description")
    String description;




}
