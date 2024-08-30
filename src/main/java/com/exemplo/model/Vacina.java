package com.exemplo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vacinas")
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataAplicacao;

    // Getters e Setters
}
