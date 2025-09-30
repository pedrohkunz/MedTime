package com.medtime.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@Entity
@Table(name = "medicine")
public class Medicine implements Serializable {
    @Id
    @GeneratedValue
    @Getter
    private UUID id;

    @Getter @Setter
    @Column(nullable = false)
    private String name;

    @Getter @Setter
    @Column(nullable = false)
    private Boolean isDeleted;

    @Getter @Setter
    @Column(nullable = false)
    private String icon;

}