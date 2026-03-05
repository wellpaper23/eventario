package com.eventario.permissions;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "permissions")

@Data
@NoArgsConstructor
public class PermissionsModel {

    public PermissionsModel(int id, String uuid, String description, String typePermission, String name) {
        this.id = id;
        this.uuid = UUID.randomUUID();
        this.description = description;
        this.typePermission = typePermission;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "uuid", unique = true, updatable = false,nullable = false)
    private UUID uuid;
    @Column(name = "description")
    private String description;
    @Column(name = "type_permission")
    private String typePermission;
    @Column(name = "name")
    private String name;

}
