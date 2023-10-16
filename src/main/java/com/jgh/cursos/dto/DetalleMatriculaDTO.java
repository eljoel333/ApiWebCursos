package com.jgh.cursos.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jgh.cursos.model.Curso;
import com.jgh.cursos.model.RegistrarMatricula;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleMatricula {


    private Integer idDetalleMatricula;
    //private RegistrarMatricula registrarMatricula;

    @JsonBackReference
    private Curso curso;

    private String aula;




}
