package com.prog.ud4;

public class Actividad4 {


	public static void main(String[] args) {
       
        double precio =85.00;
        double descuento = 15;
        double descuentotal;
        
        
        descuento = precio * descuento / 100;
        
        descuentotal = precio - descuento;
        
        System.out.println("El precio de la deportiva es" + descuentotal);
        
        
    }
    
}
