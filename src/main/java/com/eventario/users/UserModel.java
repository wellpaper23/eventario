package com.eventario.users;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserModel {
    public UserModel(Long id, UUID uuid, String username, String password, String role, String email) {
        Id = id;
        this.uuid = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name = "uuid", unique = true, updatable = false,nullable = false)
    private UUID uuid;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;
    @Column(name = "email")
    private String email;



}
