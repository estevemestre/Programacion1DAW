package Practica_3;


public class Practica3 {
	public static void main(String[] args) {
		//Creem 3 motors
		MotorP3 motor1=new MotorP3(44,5.4);
		MotorP3 motor2=new MotorP3(105,5.1);
		MotorP3 motor3=new MotorP3(86,5.2);
		
		//creem 4 averies
		AvariaP3 oli =new AvariaP3(1,"Canvi d'oli",50.0);
		AvariaP3 rodes2=new AvariaP3(2,"Canvi 2 rodes",222.50);
		AvariaP3 rodes4=new AvariaP3(3,"Canvi 4 rodes",400);
		AvariaP3 corretjaDist=new AvariaP3(4,"Corretja de distribució",190);
		
		//Creem cotxes
		CotxeP3 c1=new CotxeP3("Seat","Ibiza");
		CotxeP3 c2=new CotxeP3("Seat","Toledo");
		CotxeP3 c3=new CotxeP3("Seat","León");
		
		//Assignem motors a cotxes
		c1.setMotor(motor1);
		c2.setMotor(motor2);
		c3.setMotor(motor3);
		
		//creem un taller
		
		TallerP3 Taller1 =new TallerP3(1,"C/Major,50");
		
		//Assignar avaries als cotxes
		
		c1.setAveria(oli);
		c2.setAveria(corretjaDist);
		c3.setAveria(rodes4);
		
		//Acceptació i retorn dels cotxes en el taller
		
		Taller1.acceptarCotxe(c1);
		Taller1.acceptarCotxe(c2);
		Taller1.retornarCotxe(c1);
		Taller1.acceptarCotxe(c3);
		Taller1.retornarCotxe(c2);
		Taller1.retornarCotxe(c3);
		
		//Mostrar informació del Taller
		Taller1.visualitzarTaller();
		

	}

}
