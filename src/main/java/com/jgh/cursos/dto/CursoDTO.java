package com.jgh.cursos.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CursoDTO {

    private Integer id;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 40)
    private String nombre;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 10)
    private String siglas;

    @NotNull
    private boolean estado;



}
