package com.noxtla.gamificacion.springboot.app.springboot_jwt.Models;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "roles")
public class Role {  // Nombre en singular

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Quitado el punto y coma
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "roles")  // Relación inversa
    private Set<UsersJWT> users = new HashSet<>();  // Inicialización y nombre singular

    // Constructor vacío REQUERIDO
    public Role() {
    }

    // Constructor útil
    public Role(String name) {
        this.name = name;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UsersJWT> getUsers() {
        return users;
    }

    public void setUsers(Set<UsersJWT> users) {
        this.users = users;
    }
}