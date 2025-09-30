package com.medtime.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String name;

    @Getter @Setter
    private Boolean isDeleted;

}