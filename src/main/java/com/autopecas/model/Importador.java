package com.autopecas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Importador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paisOrigem;

    private double porcentagemImposto;
}
