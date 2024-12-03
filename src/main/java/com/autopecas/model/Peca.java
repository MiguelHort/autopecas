package com.autopecas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private double preco;

    @ManyToOne
    @JoinColumn(name = "importador_id")
    private Importador importador;
}
