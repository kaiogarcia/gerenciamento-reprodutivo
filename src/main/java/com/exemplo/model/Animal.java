package com.exemplo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "animais")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String categoria; // Bovínos, Caprínos, Ovínos, Suínos

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Enumerated(EnumType.STRING)
    private Fase fase; // Bezerro, Garrote, etc.

    // Getters e Setters
}
