package com.claudio.curso.boot.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.claudio.curso.boot.dao.FuncionarioDao;
import com.claudio.curso.boot.domain.Funcionario;

@Service
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService{

	@Autowired
	private FuncionarioDao dao;
	
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Funcionario buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Funcionario> buscarPorNome(String nome) {
		return dao.findByNome(nome);
	}

	@Override
	public List<Funcionario> buscaPorCargo(Long id) {
		return dao.findByCargoId(id);
	}

	@Override
	public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
		if(entrada != null && saida != null) {
			return dao.findByDataEntradaDataSaida(entrada, saida);
		}else if(entrada != null) {
			return dao.findByDataEntrada(entrada);
		}else if(saida != null) {
			return dao.findByDataSaida(saida);
		}else {
			return new ArrayList<>();
		}
	}

}
