package Examen;

public class Pacient {
	private static int auto;
	private int id, edad;
	private char sexo = 'H';
	private double alzada, pes;
	
	public Pacient(){
		
	}
	public Pacient(int edad, char sexo, double alzada, double pes) {
		id = ++auto;
		this.edad = edad;
		this.sexo = sexo;
		this.alzada = alzada;
		this.pes = pes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAlzada() {
		return alzada;
	}

	public void setAlzada(double alzada) {
		this.alzada = alzada;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}
	
	public double imc(){
		return pes/Math.pow(alzada, 2);
	}
	public String indiceIMC(){
		if(imc()<18.5) return "Pes insuficient";
		else if(imc()<24.9) return "Pes normal";
		else if(imc()<26.9) return "Sobrepes Grau I";
		else if(imc()<29.9) return "Sobrepes GrauII";
		else return "Sobrepes grau III";
	}
}
