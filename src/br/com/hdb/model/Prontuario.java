package br.com.hdb.model;

import javax.persistence.Column;
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
pkColumnValue = "prontuarios",
initialValue = 1 ,
allocationSize= 1)

public class Prontuario {
 
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="geradordeid")
	private int id;
	
	@Column(name="Num_Prontuario")
	private int num_pront;
	
	@Column(name="DataAbertura_Prontuario")
	private String dt_pront;
	
	@Column(name = "NomePaciente_Prontuario")
	private String nm_pront;
	
	public Prontuario() {
		
	}
	
	public Prontuario(int numero,String data, String nome)
	{
		super();
		this.num_pront = numero;
		this.dt_pront = data;
		this.nm_pront = nome; 
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getNum_pront() {
		return num_pront;
	}

	public void setNum_pront(int num_pront) {
		this.num_pront = num_pront;
	}

	public String getDt_pront() {
		return dt_pront;
	}

	public void setDt_pront(String dt_pront) {
		this.dt_pront = dt_pront;
	}

	public String getNm_pront() {
		return nm_pront;
	}

	public void setNm_pront(String nm_pront) {
		this.nm_pront = nm_pront;
	}
	
	@Override
	public String toString() {
		return "Numero de Prontuario: " + nm_pront + " Data de abertura do prontuario: " + dt_pront + " Nome do paciente : " + nm_pront;
	}
}

	