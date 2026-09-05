package com.poringhabits.model.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<HabitEntity> habits;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EggEntity> eggs;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<HabitEntity> getHabits() {
        return habits;
    }

    public void setHabits(Set<HabitEntity> habits) {
        this.habits = habits;
    }

    public Set<EggEntity> getEggs() {
        return eggs;
    }

    public void setEggs(Set<EggEntity> eggs) {
        this.eggs = eggs;
    }
}
