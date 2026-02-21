package com.eventario.type;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

@Data

@NoArgsConstructor

@Entity
@Table(name = "type")
public class TypeModel {
    public TypeModel(String name, String description) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    Long id;

    @Column(name = "uuid_type", unique = true, updatable = false,nullable = false)
    UUID uuid;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;


}
