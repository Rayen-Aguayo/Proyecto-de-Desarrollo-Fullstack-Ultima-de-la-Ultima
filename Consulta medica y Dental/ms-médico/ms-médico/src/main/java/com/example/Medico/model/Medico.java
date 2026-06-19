package com.example.Medico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medico")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Medico {
    @Id
    private String run;

    private String nombreMedico;
    private Integer edad;
    private String nroTelefono;
    private String especialidad;
    private String firmaMedico;
}
