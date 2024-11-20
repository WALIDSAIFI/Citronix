package com.projet.citronix.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
public class Champ {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double superficie;
    @ManyToOne
    @JoinColumn(name = "ferme_id", nullable = false)
    private Ferme ferme;

    @OneToMany(mappedBy = "champ", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Arbre> arbres;

}


