package com.jgh.cursos.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jgh.cursos.model.Curso;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetalleMatriculaDTO {


    @NotNull
    private Curso curso;

    private String aula;

    @JsonBackReference
    private RegistrarMatriculaDTO registrarMatriculaDTO;


}
