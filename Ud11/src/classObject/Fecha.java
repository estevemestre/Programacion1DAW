package classObject;

import java.util.Scanner;

public class Fecha { 

	private int dia;
	private int mes;
	private int any;
	
	
	public Fecha (int dia, int mes, int any) {
	
		Scanner lector = new Scanner(System.in);
	
		this.dia = dia;
		this.mes = mes;
		this.any = any;

	}

	@Override
	public String toString() {
		return "Esta es mi fecha de nacimiento "+dia+ " / " +mes+ " / " +any;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (any != other.any)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha(4,7,1993);
		Fecha fecha2 = new Fecha(4,7,1993);
		
		System.out.println(fecha1);
		System.out.println(fecha2);
		
		
		if(fecha1.equals(fecha2)) {
			System.out.println("Son iguales");
		}else{
			System.out.println("no son iguales");
		}
		
		
		
		System.out.println(fecha1);
		
	}
}


