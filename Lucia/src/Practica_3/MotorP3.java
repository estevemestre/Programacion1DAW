package Practica_3;

public class MotorP3 {
	private int cv;
	private double consum;
	
	public MotorP3(){
		
	}

	public MotorP3(int cv, double consum){
		if(comprovacioCV(cv)==true && comprovacioConsum(consum)==true){
			this.cv=cv;
			this.consum=consum;
		}else{
			this.cv=0;
			this.consum=0.0;
		}
		
	}

	//getters i setters
	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public double getConsum() {
		return consum;
	}

	public void setConsum(double consum) {
		this.consum = consum;
	}
	
	//validació de cv i consum no poden ser negatius
	public boolean comprovacioCV(int cv){
		if(cv<0){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean comprovacioConsum(double consum){
		if(consum<0){
			return false;
		}else{
			return true;
		}
	}
}
