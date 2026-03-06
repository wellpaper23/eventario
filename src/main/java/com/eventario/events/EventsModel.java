package com.eventario.events;

import com.eventario.users.UserModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "events")
public class EventsModel {
    public EventsModel(Long id, UUID uuid, String name, String description, LocalDate date, LocalTime time, String status, String creator) {
        Id = id;
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.date = date;
        this.time = time;
        this.status = status;
        this.creator = creator;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "uuid", unique = true, updatable = false,nullable = false)
    private UUID uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "time")
    private LocalTime time;
    @Column(name = "status")
    private String status;
    @Column(name = "creator")
    private String creator;


}