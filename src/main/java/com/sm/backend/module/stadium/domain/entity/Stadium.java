package com.sm.backend.module.stadium.domain.entity;

import com.sm.backend.common.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "stadium")
public class Stadium extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stadium_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "size")
    private int size;

    @Column(name = "address")
    private String address;

    @Column(name = "region")
    @Enumerated(EnumType.STRING)
    private Region region;

    @Column(name = "minimum_personnel")
    private int minimumPersonnel;

    @Column(name = "maximum_personnel")
    private int maximumPersonnel;

    @Column(name = "parking_available")
    private boolean parkingAvailable;

    @Column(name = "shower_available")
    private boolean showerAvailable;

    @Column(name = "description")
    private String description;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "active")
    private boolean active;

    public void update(String name, int size, String address, int minimumPersonnel, int maximumPersonnel, boolean parkingAvailable, boolean showerAvailable, String description, LocalDateTime startTime, LocalDateTime endTime, boolean active) {
        this.name = name;
        this.size = size;
        this.address = address;
        this.minimumPersonnel = minimumPersonnel;
        this.maximumPersonnel = maximumPersonnel;
        this.parkingAvailable = parkingAvailable;
        this.showerAvailable = showerAvailable;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.active = active;
    }

    public Stadium updateName(String name) {
        this.name = name;
        return this;
    }

    public Stadium updateSize(int size) {
        this.size = size;
        return this;
    }
}
