package com.jgh.cursos.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class DetalleMatricula {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_registra_matricula")
    @JsonBackReference
    private RegistrarMatricula registrarMatricula;

    @ManyToOne//(FK)
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @Column(length = 5, nullable = false)
    private String aula;
}
