package Actividad4;
import java.util.Scanner;

public class Reloj {
	
	
	private int hora;
	private int minuto;
	private int segundo;
	
	

	private static Scanner sc;
	
	
	public int getHora() {
		return hora;
	}
	
	
	public void setHora(int hora) {
		this.hora = hora;
	
	}
	public int getMinuto() {
		return minuto;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
	
		this.segundo = segundo;
	}
	
	
	
	
	
	public Reloj(){
		this.hora=0;
		this.minuto=0;
		this.segundo=0;
		
	}
	
	
	
	public Reloj(int hora,int minuto,int segundo){
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}
	
	public void comprobar(){
		
		 sc=new Scanner(System.in);
	
		 boolean condicion1;
		
		if(hora<0 || hora>23){
			
			condicion1=true;
		
			while(condicion1){
				
				System.out.println("Ha habido un error ,la Hora no puede ser menor que 0 o mayor que 23");
				
				System.out.println("Introduzca un valor correcto para la hora");
			
				this.hora=Integer.parseInt(sc.nextLine());
				
				
				if(hora<0 || hora>23){
				condicion1=true;
				}else{
					condicion1=false;
				}
			
			}
		}
		
		
		
		
		if(minuto<0 || minuto>59){
			condicion1=true;
			while(condicion1){
			System.out.println("Ha habido un error ,los minutos"
			+" no puede ser menor que 0 o mayor que 59");
			System.out.println("Introduzca un valor correcto para los segundos");
			this.minuto=Integer.parseInt(sc.nextLine());
			if(minuto<0 || minuto>59){
				condicion1=true;
			}else{
				condicion1=false;
			}
			}
		}
		if(segundo<0 || segundo>59){
			condicion1=true;
			while(condicion1){
			System.out.println("Ha habido un error ,los segundos"
			+" no puede ser menor que 0 o mayor que 59");
			System.out.println("Introduzca un valor correcto para los segundos");
			this.segundo=Integer.parseInt(sc.nextLine());
			if(minuto<0 || minuto>59){
				condicion1=true;
			}else{
				condicion1=false;
			}
			}
		}
		
	}
		
	public void ponerReloj(int hora,int minutos){
		this.hora=hora;
		this.minuto=minutos;
		this.segundo=0;
		
	}
	public void ponerReloj(int hora,int minutos,int segundos){
		this.hora=hora;
		this.minuto=minutos;
		this.segundo=segundos;
		
	}
	public String mostrarAmPm(){
		
		if(hora<=12){
			return "AM";
		}else{
			this.hora=hora-12;
			return "PM";
		}
		
	}
	
	
	
	
	public void mostrarHora(){
		comprobar();
		String comp=mostrarAmPm();
	System.out.println(this.hora+":"+this.minuto+":"+this.segundo+" "+comp);
	cerrar();
}
	public void cerrar(){
		
		sc=new Scanner("");
		sc.close();
		
	}
	
}
