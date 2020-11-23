package br.com.hdb.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {
 
	private static final String URL = "jdbc:mysql://localhost/db_hdb";
	private static final  String VarUsuario = "root";
	private static final  String VarSenha = ""; 
    
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,VarUsuario,VarSenha);
	}
}
