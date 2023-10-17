package com.jgh.cursos.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class RegistrarMatricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;


   private LocalDateTime fechaMatricula;

    @ManyToOne//(FK)
    private Estudiante estudiante;

    @OneToMany(mappedBy = "registrarMatricula", cascade = CascadeType.ALL) //, fetch = FetchType.LAZY)
    //@JsonManagedReference
    private List<DetalleMatricula> detalleMatricula;


    private boolean estado;

}
