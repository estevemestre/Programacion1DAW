package Practica4;
import java.util.Scanner;

public class Fraccions {

	Scanner teclado = new Scanner (System.in);
	
	
	private int numerador;
	private int denominador;
	private int contFrac;

// Utilitze este constructor per a demanar dades al usuari	
	
	public Fraccions() {
		System.out.println("Inserta un numerador: ");
		this.numerador=Integer.parseInt(teclado.nextLine());
		while(this.denominador <= 0){
			
			System.out.println("Inserta un denominador. ");
			this.denominador=Integer.parseInt(teclado.nextLine());
			
			if(this.denominador == 0) {
				System.out.println("Introduix un denominador major que 0");
			}
			this.contFrac = contFrac +1;
		}
	}
		
		
		public Fraccions(int numerador, int denominador){
			this.numerador=numerador;
		
			contFrac=contFrac+1;
		}
		
	
		


	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public int getContFrac() {
		return contFrac;
	}

	public void setContFrac(int contFrac) {
		this.contFrac = contFrac;
	}

	public void visualitzarInformacio(){
		System.out.println("Fracció "+contFrac+": "+numerador+"/"+denominador);
	}
	
	public void infoSimplificacio() {
		int mcd=mcd(this.numerador,this.denominador);
		if(this.numerador==0){
			System.out.println("Aquesta fracció és 0.");
		}else if(this.denominador/mcd==1){
			System.out.println("Simplificada: "+this.numerador);
		}else{
			System.out.println("Simplificada: "+this.numerador+"/"+this.denominador);
		}	
	}
	
		public int mcd(int numerador, int denominador){
			int mcd;
			if (denominador==0){
				mcd=numerador;
			}else{
				mcd= mcd(denominador, numerador%denominador);
			}
			
			return mcd;
		}
		
		
		public int mcm (int numerador, int denominador){
			int mcm;
			mcm=(numerador*denominador)/mcd(numerador,denominador);
			return mcm;
		}
		
		
		public void simplificarFrac(){
			int mcd=mcd(this.numerador, this.denominador);
				if(numerador/mcd!=1 || denominador/mcd!=1 || mcd!=1){
					this.numerador=numerador/mcd;
					this.denominador=denominador/mcd;
				}
		}

		public void resta(Fraccions fraccio){
			int numerador;
			int denominador;
			denominador=mcm(this.denominador, fraccio.getDenominador());
			numerador=(((denominador/this.denominador)* this.numerador)-((denominador/fraccio.getDenominador())*fraccio.getNumerador()));
			Fraccions resta=new Fraccions(numerador,denominador);
			
			System.out.print("La resta de les fraccions és: ");
			resta.visualitzarInformacio();
			resta.simplificarFrac();
			resta.infoSimplificacio();
		}
	
		public void suma(Fraccions fraccio){
			int numerador;
			int denominador;
			denominador=mcm(this.denominador, fraccio.getDenominador());
			numerador=(((denominador/this.denominador)* this.numerador)+((denominador/fraccio.getDenominador())*fraccio.getNumerador()));
			Fraccions suma=new Fraccions(numerador,denominador);
			
			System.out.print("La suma de les  fraccions és: ");
			suma.visualitzarInformacio();
			suma.simplificarFrac();
			suma.infoSimplificacio();
		}
		
		


		public void divisio(Fraccions fraccio){
			int numerador=this.numerador*fraccio.getDenominador();
			int denominador=this.denominador*fraccio.getNumerador();
			Fraccions divisio=new Fraccions(numerador,denominador);
			
			System.out.print("La divisió de les fraccions és: ");
			divisio.visualitzarInformacio();
			divisio.simplificarFrac();
			divisio.simplificarFrac();
		}
		
		
		public void multFrac(Fraccions fraccio){
			int num=this.numerador*fraccio.getNumerador();
			int den=this.denominador*fraccio.getDenominador();
			Fraccions multiplicacio=new Fraccions(num,den);
			
			System.out.print("La multiplicació de les fraccions és: ");
			multiplicacio.visualitzarInformacio();
			multiplicacio.simplificarFrac();
			multiplicacio.simplificarFrac();
		}
	}
