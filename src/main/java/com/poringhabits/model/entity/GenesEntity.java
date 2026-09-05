package com.poringhabits.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "genes")
public class GenesEntity {

    private final String name;
    private final Boolean predominantGene;
    private final String characteristic;

    public GenesEntity(String name, Boolean predominantGene, String characteristic) {
        this.name = name;
        this.predominantGene = predominantGene;
        this.characteristic = characteristic;
    }
}
