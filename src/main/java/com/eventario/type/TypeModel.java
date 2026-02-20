package com.eventario.type;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "type")
public class TypeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    long id;

    @Column(name = "uuid_type", unique = true)
    UUID uuid;

    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;


}
