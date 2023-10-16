package com.jgh.cursos.controller;


import com.jgh.cursos.dto.CursoDTO;
import com.jgh.cursos.dto.EstudianteDTO;
import com.jgh.cursos.model.Curso;
import com.jgh.cursos.model.Estudiante;
import com.jgh.cursos.service.ICursoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos") //comentario
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class CursoController {

    private final ICursoService service;
    @Qualifier("defaultMapper")
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<CursoDTO>> readAll()throws Exception{
        List<CursoDTO> list = service.readAll().stream().map(this::convertToDto).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursoDTO> readAllById(@PathVariable("id") Integer id) throws Exception{
        CursoDTO dto = convertToDto(service.readById(id));
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CursoDTO> create(@Valid @RequestBody CursoDTO dto)throws Exception{
        Curso obj = service.save(convertToEntity(dto));
        return new ResponseEntity<>(convertToDto(obj), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CursoDTO> update(@Valid @RequestBody CursoDTO dto, @PathVariable("id") Integer id) throws Exception{
        dto.setId(id);
        Curso obj = service.update(convertToEntity(dto), id);
        return new ResponseEntity<>(convertToDto(obj), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id)throws Exception{
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    ////////////////////////////conversiones
    private CursoDTO convertToDto(Curso obj){
        return mapper.map(obj, CursoDTO.class);
    }

    private Curso convertToEntity(CursoDTO dto){
        return mapper.map(dto, Curso.class);
    }
}
