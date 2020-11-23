package br.com.hdb.controller;

import java.util.List;

import br.com.hdb.dao.ProntuarioDAO;
import br.com.hdb.model.Prontuario;

public class Sistema {

	public static void main(String[] args) throws Exception {

ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
		
		//Salvar dados
		
			//Prontuario prontuario = new Prontuario(6,"","");
			//ProntuarioDAO.salvar(prontuario);
		
//Apagar dados  --->  prontuarioDAO.apagar(6);
		
		//Listar --> 
			
				List<Prontuario> listarprontuario = prontuarioDAO.listar();
				
				/*	int id = 6;
					for (Prontuario p : listarprontuario) {
						
							
							System.out.println(p.getId(6));								
						
					}
					String[] pronturioLista = new String[10];
					
					for (int i=0; i<=0; i++) {
						
					 prontuarioLista[i] = (p);								
					
					}
				 */
				
			
		//Buscar ---> 	 ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
	  //                 prontuarioDAO.buscarPorId(getId(6));
					
		
		
			//Atualizar   --->   prontuarioDAO.atualizar();
		
		
	}
}
