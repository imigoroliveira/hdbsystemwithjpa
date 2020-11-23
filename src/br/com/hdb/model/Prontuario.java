package br.com.hdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "prontuarios")
@TableGenerator(
name = "geradordeid",
table = "sql_sequence",
pkColumnName = "name",
valueColumnName= "seq",
pkColumnValue = "pessoa_id",
initialValue = 1 ,
allocationSize= 1)

public class Prontuario {
 
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="geradordeid")

	
	private int Num_Prontuario;
	private String DataAbertura_Prontuario;
	private String NomePaciente_Prontuario;
	
	public Prontuario() {
		
	}
	
	
	public Prontuario(int nm_pront, String DataAbertura_Prontuario, String NomePaciente_Prontuario) {
		super();
		this.Num_Prontuario = nm_pront;
		this.DataAbertura_Prontuario = DataAbertura_Prontuario;
		this.NomePaciente_Prontuario = NomePaciente_Prontuario;
	}


	public int getNum_Prontuario() {
		return Num_Prontuario;
	}
	public void setNum_Prontuario(int Num_Prontuario) {
		this.Num_Prontuario = Num_Prontuario;
	}
	public String getDataAbertura_Prontuario() {
		return DataAbertura_Prontuario;
	}
	public void setDataAbertura_Prontuario(String DataAbertura_Prontuario) {
		this.DataAbertura_Prontuario = DataAbertura_Prontuario;
	}
	public String getNomePaciente_Prontuario() {
		return NomePaciente_Prontuario;
	}
	public void setNomePaciente_Prontuario(String NomePaciente_Prontuario) {
		this.NomePaciente_Prontuario = NomePaciente_Prontuario;
	}
	
	@Override
	public String toString() {
		return "Número do Prontuario: " + Num_Prontuario 
				+ "\n" + " Data de abertura do prontuario: " + DataAbertura_Prontuario 
				+ "\n" + " Nome do Paciente: " + NomePaciente_Prontuario ;
	}
}
