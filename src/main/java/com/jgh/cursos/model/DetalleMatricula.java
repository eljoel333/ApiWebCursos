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
    @JoinColumn(name = "id_registra_matricula", nullable = false, foreignKey = @ForeignKey(name = "FK_DETAIL_MATRICULA"))
    //@JsonBackReference
    private RegistrarMatricula registrarMatricula;

    @ManyToOne//(FK)
    @JoinColumn(name = "id_curso", nullable = false, foreignKey = @ForeignKey(name = "FK_DETAIL_CURSO"))
    private Curso curso;

    @Column(length = 5, nullable = false)
    private String aula;
}
