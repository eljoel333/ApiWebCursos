package com.jgh.cursos.service.impl;

import com.jgh.cursos.model.RegistrarMatricula;
import com.jgh.cursos.repo.IGenericRepo;
import com.jgh.cursos.repo.IRegistraMatriculaRepo;
import com.jgh.cursos.service.IRegistraMatriculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistraMatriculaImpl extends CRUDImpl<RegistrarMatricula, Integer> implements IRegistraMatriculaService {

    private final IRegistraMatriculaRepo repo;

    @Override
    protected IGenericRepo<RegistrarMatricula, Integer> getRepo() {
        return repo;
    }
}
