package Practica_4;

import java.util.Scanner;

public class FraccionsP4 {
	
	private int numerador;
	private int denominador;
	static int id;
	
	Scanner teclat=new Scanner (System.in);
	
	//constructors
	public FraccionsP4(){
		System.out.println("Inserta el numerador:");
		this.numerador=Integer.parseInt(teclat.nextLine());
		System.out.println("Inserta denominador:");
		this.denominador=comprovarDenominador(Integer.parseInt(teclat.nextLine()));
		id=id+1;
	}

	public FraccionsP4(int numerador, int denominador){
		this.numerador=numerador;
		this.denominador=comprovarDenominador(denominador);
		id=id+1;
	}
	
	// getters i setters
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
		this.denominador = comprovarDenominador(denominador);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//visualitza la fracció
	
	public void visualitzarFraccio(){
		System.out.println("FRACCIÓ "+id+": "+numerador+"/"+denominador);
	}
	public void visualitzaResultat(){
		System.out.println(numerador+"/"+denominador);	
	}
	public void visualitzaSimplificacio(){
		int mcd=mcd(this.numerador,this.denominador);
		if(this.numerador==0){
			System.out.println("Aquesta fracció és 0.");
		}else if(this.denominador/mcd==1){
			System.out.println("Simplificada: "+this.numerador);
		}else{
			System.out.println("Simplificada: "+this.numerador+"/"+this.denominador);
		}	
	}
	
	// Validar denominador (mètode recursiu, es crida a ell mateix)
	public int comprovarDenominador(int denominador){
		if (denominador==0){
			System.out.println("El denominador no pot ser 0. \n Inserta un nou denominador :");
			denominador =Integer.parseInt(teclat.nextLine());
			comprovarDenominador(denominador);
		}
		return denominador;
	}
	
	// màxim comú divisor (Algoritme d'Euclides)  http://ca.wikipedia.org/wiki/Algorisme_d%27Euclides
	public int mcd(int a, int b){
		int mcd;
		if (b==0){
			mcd=a;
		}else{
			mcd= mcd(b, a%b);
		}
		
		return mcd;
	}
	
	//mínim comú múltiple    mcd(a,b)*mcm(a*b)=a*b
	public int mcm (int a, int b){
		int mcm;
		mcm=(a*b)/mcd(a,b);
		return mcm;
	}
	
	//simplificar fraccions 
	public void simplifica(){
		int mcd=mcd(this.numerador, this.denominador);
			if(numerador/mcd!=1 || denominador/mcd!=1 || mcd!=1){
				this.numerador=numerador/mcd;
				this.denominador=denominador/mcd;
			}
	}

	
	// suma de fraccions
	public void suma(FraccionsP4 fraccio){
		int num;
		int den;
		den=mcm(this.denominador, fraccio.getDenominador());
		num=(((den/this.denominador)* this.numerador)+((den/fraccio.getDenominador())*fraccio.getNumerador()));
		FraccionsP4 fSuma=new FraccionsP4(num,den);
		
		System.out.print("La suma de les fraccions és: ");
		fSuma.visualitzaResultat();
		fSuma.simplifica();
		fSuma.visualitzaSimplificacio();
	}
	
	//resta de fraccions
	public void resta(FraccionsP4 fraccio){
		int num;
		int den;
		den=mcm(this.denominador, fraccio.getDenominador());
		num=(((den/this.denominador)* this.numerador)-((den/fraccio.getDenominador())*fraccio.getNumerador()));
		FraccionsP4 fResta=new FraccionsP4(num,den);
		
		System.out.print("La resta de les fraccions és: ");
		fResta.visualitzaResultat();
		fResta.simplifica();
		fResta.visualitzaSimplificacio();;
	}
	
	//divideix fraccions
	public void divisio(FraccionsP4 fraccio){
		int num=this.numerador*fraccio.getDenominador();
		int den=this.denominador*fraccio.getNumerador();
		FraccionsP4 fDivisio=new FraccionsP4(num,den);
		
		System.out.print("La divisió de les fraccions és: ");
		fDivisio.visualitzaResultat();
		fDivisio.simplifica();
		fDivisio.visualitzaSimplificacio();
	}
	
	//multiplica fraccions
	public void multiplicacio(FraccionsP4 fraccio){
		int num=this.numerador*fraccio.getNumerador();
		int den=this.denominador*fraccio.getDenominador();
		FraccionsP4 fMultiplicacio=new FraccionsP4(num,den);
		
		System.out.print("La multiplicació de les fraccions és: ");
		fMultiplicacio.visualitzaResultat();
		fMultiplicacio.simplifica();
		fMultiplicacio.visualitzaSimplificacio();
	}
}
