package com.jgh.cursos.model;

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
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nombres;

    @Column(length = 100, nullable = false)
    private String apellidos;

    @Column(length = 100, nullable = false)
    private String dni;

    @Column(nullable = false)
    private Integer edad;




}
