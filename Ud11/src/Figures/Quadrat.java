package Figures;


public class Quadrat extends Figura{

 private double costat;

 public Quadrat(double costat) {
	 
	 this.costat = costat;
 }
 
 
@Override
public String toString() {
	return  super.toString() + "Quadrat costa" + costat;
}

 
 public double calcularArea() {	 
	 return this.costat * this.costat;
	}	
}
