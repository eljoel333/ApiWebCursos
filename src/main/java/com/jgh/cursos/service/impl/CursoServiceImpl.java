package com.jgh.cursos.service.impl;


import com.jgh.cursos.model.Curso;
import com.jgh.cursos.repo.ICursoRepo;
import com.jgh.cursos.repo.IGenericRepo;
import com.jgh.cursos.service.ICursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl extends CRUDImpl<Curso, Integer> implements ICursoService {

    private final ICursoRepo repo;
    @Override
    protected IGenericRepo<Curso, Integer> getRepo() {
        return repo;
    }
}
