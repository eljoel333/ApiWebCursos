package com.jgh.cursos.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jgh.cursos.model.DetalleMatricula;
import com.jgh.cursos.model.Estudiante;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegistrarMatriculaDTO {

    private Integer id;

    @NotNull
    private LocalDateTime fechaMatricula;

    @NotNull
    private Estudiante estudiante;


    @NotNull
    private List<DetalleMatriculaDTO> detalleMatricula;

    @NotNull
    private boolean estado;
}
