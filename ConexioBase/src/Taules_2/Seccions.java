package Taules_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Seccions {

	static Connection con = ConexioBaseDades.MySQL.Connectar("shop");
	static Statement st = null;
	static Scanner reader = new Scanner (System.in);

	
	private static int codiTotal; // Asi guardare el select 
	
	private int auxCodi;
	private String codi;
	private String nom;
	
	
	public Seccions (int cod) {
		
		if (cod >= 10) {
		this.codi = "s" + cod;
		}else{
		this.codi = "s0" + cod;	
		}
		System.out.println("inserta un nom de la seccio");
		this.nom = reader.nextLine();
		
	}


	public String getCodi() {
		return codi;
	}


	public void setCodi(String codi) {
		this.codi = codi;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}	
}
