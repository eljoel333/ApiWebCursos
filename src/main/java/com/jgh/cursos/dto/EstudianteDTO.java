package com.jgh.cursos.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EstudianteDTO {

    private Integer idEstudiante;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 40)
    private String nombresEstudiante;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 100)
    private String apellidosEstudiante;

    @NotNull
    @NotEmpty
    @Size(min = 10, max = 25)
    private String dniEstudiante;


    private Integer edadEstudiante;
}
