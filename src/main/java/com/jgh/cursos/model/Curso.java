package com.jgh.cursos.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity

public class Curso {


    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer id;


    @Column(length = 100, nullable = false)
    private String nombre;


    @Column(length = 10, nullable = false)
    private String siglas;


    @Column(nullable = false)
    private boolean estado;



}
