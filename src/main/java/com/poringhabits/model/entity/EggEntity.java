package com.poringhabits.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "eggs")
public class EggEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column(nullable = false)
    private final EggType eggType;
    @Column(nullable = false)
    private final Category category;
    @Column(nullable = false)
    private final Long currentProgress;
    @Column(nullable = false)
    private final Long requiredProgress;
    private final List<GenesEntity> genetics;

    public EggEntity(Long id, EggType eggType, Category category, Long currentProgress, Long requiredProgress, List<GenesEntity> genetics) {
        this.id = id;
        this.eggType = eggType;
        this.category = category;
        this.currentProgress = currentProgress;
        this.requiredProgress = requiredProgress;
        this.genetics = genetics;
    }
}
