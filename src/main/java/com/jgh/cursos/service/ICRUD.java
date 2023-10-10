package com.jgh.cursos.service;

import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ICRUD<T,ID> {

    T save(T t) throws Exception;
    T update(T t, ID id) throws Exception;
    List<T> readAll() throws Exception;

    T readById(ID id) throws Exception;

    void delete(ID id) throws Exception;

    //Page<T> getPage(Pageable pageable) throws Exception;
}
