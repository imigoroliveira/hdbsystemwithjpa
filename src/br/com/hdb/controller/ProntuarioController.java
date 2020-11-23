package br.com.hdb.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.Executor;

import br.com.hdb.dao.ProntuarioDAO;
import br.com.hdb.model.Prontuario;

public class ProntuarioController {
	
	public static void main(String[] args) throws Exception {

		
		ProntuarioDAO prontuarioDAO = new ProntuarioDAO();

		 
		List<Prontuario> listaProntuarios = prontuarioDAO.listar();
		
	   for(Prontuario pront: listaProntuarios){
		   System.out.println(pront); //BuscarProntuarios
	   }
	}
	

	
	
	
public static void excluirProntuario() throws Exception {
		
		
}
	
}