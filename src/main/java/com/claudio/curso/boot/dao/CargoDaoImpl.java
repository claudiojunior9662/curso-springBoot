package com.claudio.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.claudio.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}
