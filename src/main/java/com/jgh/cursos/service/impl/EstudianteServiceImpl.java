package com.jgh.cursos.service.impl;

import com.jgh.cursos.model.Estudiante;
import com.jgh.cursos.repo.IEstudianteRepo;
import com.jgh.cursos.repo.IGenericRepo;
import com.jgh.cursos.service.IEstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl extends CRUDImpl<Estudiante, Integer> implements IEstudianteService {
    private final IEstudianteRepo repo;
    @Override
    protected IGenericRepo<Estudiante, Integer> getRepo() {
        return repo;
    }
}
