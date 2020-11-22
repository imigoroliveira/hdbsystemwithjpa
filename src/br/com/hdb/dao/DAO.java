package br.com.hdb.dao;

import java.util.List;

public interface DAO<T> {
	
T salvar(T entidade);
T atualizar(T entidade);
T buscarporCod(Integer Cod_Prontuario);
List<T> listar();
void apagar(Integer Cod_Prontuario);

}
