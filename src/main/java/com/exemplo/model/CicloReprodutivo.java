package com.exemplo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ciclos_reprodutivos")
public class CicloReprodutivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;

    @Column(nullable = false)
    private String tipo; // Fecundação Natural, Fecundação Artificial

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataGestacao;

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataParto;

    // Getters e Setters
}
