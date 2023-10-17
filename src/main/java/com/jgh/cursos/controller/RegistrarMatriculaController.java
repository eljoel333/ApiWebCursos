package com.jgh.cursos.controller;


import com.jgh.cursos.dto.EstudianteDTO;
import com.jgh.cursos.dto.RegistrarMatriculaDTO;
import com.jgh.cursos.model.Estudiante;
import com.jgh.cursos.model.RegistrarMatricula;
import com.jgh.cursos.service.IRegistraMatriculaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/registramatricula") //comentario
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class RegistrarMatriculaController {

    private final IRegistraMatriculaService service;
    @Qualifier("defaultMapper")
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<RegistrarMatriculaDTO>> readAll()throws Exception{
        List<RegistrarMatriculaDTO> list= service.readAll().stream().map(this::convertToDto).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrarMatriculaDTO> readAllById(@PathVariable("id") Integer id)throws Exception{
        RegistrarMatriculaDTO dto = convertToDto(service.readById(id));
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<RegistrarMatriculaDTO> create(@Valid @RequestBody RegistrarMatriculaDTO dto) throws Exception{
        RegistrarMatricula obj = service.save(convertToEntity(dto));
        return new ResponseEntity<>(convertToDto(obj), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistrarMatriculaDTO> update(@Valid @RequestBody RegistrarMatriculaDTO dto, @PathVariable("id") Integer id) throws Exception{
        dto.setId(id);
        RegistrarMatricula obj = service.update(convertToEntity(dto), id);
        return new ResponseEntity<>(convertToDto(obj), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    ////////////////////////////conversiones
    private RegistrarMatriculaDTO convertToDto(RegistrarMatricula obj){
        return mapper.map(obj, RegistrarMatriculaDTO.class);
    }

    private RegistrarMatricula convertToEntity(RegistrarMatriculaDTO dto){
        return mapper.map(dto, RegistrarMatricula.class);
    }



}
