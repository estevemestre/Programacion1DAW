
package Practica_2;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AlumneP2 {
	private AssignaturaP2 assig1;
	private AssignaturaP2 assig2;
	private AssignaturaP2 assig3;
	private String NomCognoms;
	private String correu;
	private GregorianCalendar dataNaix;	//Declarem l'objecte de la classe GregorianCalendar
	
	Scanner teclat = new Scanner(System.in);
	
	public AlumneP2(){
		int dia;
		int mes;
		int any;				

		System.out.println("Inserta el nom complet de l'alumne: ");
		this.NomCognoms=teclat.nextLine();
		System.out.println("Inserta l'e-mail de l'alumne: ");
		this.correu=teclat.nextLine();
		System.out.println("Inserta el dia de naixement:");
		dia=Integer.parseInt(teclat.nextLine());
		System.out.println("Inserta el mes de naixement:(en número)");
		mes=Integer.parseInt(teclat.nextLine());
		System.out.println("Inserta l'any de naixement: ");
		any=Integer.parseInt(teclat.nextLine());
		
		dataNaix=new GregorianCalendar(any,mes-1,dia); //restem 1 al mes perquè GregorianCalendar comencen els mesos per 0.(el mes 6, allí és el mes 5)
		
	}
	
	public AlumneP2(AssignaturaP2 a1, AssignaturaP2 a2, AssignaturaP2 a3, String NomCognoms,String correu, int dia, int mes, int any){
		
		//Creem l'objecte dataNaix 
		dataNaix =new GregorianCalendar(any, mes-1, dia);
		
		if(calcularEdat(dataNaix)<18){
			System.out.println("Student must be older than 18");
		}else {
			this.assig1=a1;
			this.assig2=a2;
			this.assig3=a3;
			this.NomCognoms=NomCognoms;
			this.correu=correu;
		}
	}
	
	public AlumneP2 (int id1, int id2, int id3, String nom, String correu,int any, int mes, int dia){
		
		//Creem l'objecte dataNaix 
		//(S'ha de crear en cada Constructor perquè utilitzem el que utilitzem al instanciar un objecte, s'haurà de crear l'objecte data)
		dataNaix =new GregorianCalendar();
		//modifiquem la data a la de naixement
		dataNaix.set(any, mes-1, dia);
		if(calcularEdat(dataNaix)<18){
			System.out.println("Student must be older than 18");
		}else{
			assig1=new AssignaturaP2(id1);
			assig2=new AssignaturaP2(id2);
			assig3=new AssignaturaP2(id3);
			this.NomCognoms=nom;
			this.correu=correu;
		}
	}
	
	//getters i setters
	public AssignaturaP2 getAssig1() {
		return assig1;
	}

	public void setAssig1(AssignaturaP2 assig1) {
		this.assig1 = assig1;
	}

	public AssignaturaP2 getAssig2() {
		return assig2;
	}

	public void setAssig2(AssignaturaP2 assig2) {
		this.assig2 = assig2;
	}

	public AssignaturaP2 getAssig3() {
		return assig3;
	}

	public void setAssig3(AssignaturaP2 assig3) {
		this.assig3 = assig3;
	}
	
	public String getNomCognoms() {
		return NomCognoms;
	}

	public void setNomCognoms(String nomCognoms) {
		NomCognoms = nomCognoms;
	}

	public String getCorreu() {
		return correu;
	}

	public void setCorreu(String correu) {
		this.correu = correu;
	}

	public GregorianCalendar getDataNaix() {
		return dataNaix;
	}

	public void setDataNaix(GregorianCalendar dataNaix) {
		this.dataNaix = dataNaix;
	}

	//calcula la mitjana de les notes de les 3 assignatures d'1 alumne.
	public double calcularMitjana(){
		double mitjana;
		if(assig1.getQualificacio()<4 || assig2.getQualificacio()<4 || assig3.getQualificacio()<4){
			mitjana=-1.0;
		}else{
			mitjana=(assig1.getQualificacio()+assig2.getQualificacio()+assig3.getQualificacio())/3;
		}
		return mitjana;
	}
	
	//validar la nota mitjana. Si dóna -1 sortirà un missatge d'error.
	public void comprovaMitjana(double mitjana){
		if(mitjana==-1){
			System.out.println("Qualifications average not avalaible");
		}else{
			System.out.println("La mitjana és de "+mitjana);
		}
	}
	
	//Calcular l'edat a partir de la data de naixement
	public int calcularEdat(GregorianCalendar dataNaix){
		int anys;
		GregorianCalendar dataActual =new GregorianCalendar();
		
		anys=dataActual.get(GregorianCalendar.YEAR)-dataNaix.get(GregorianCalendar.YEAR)-1; //Li lleve 1 perquè pot ser que aquest any encara no haja complit anys.
		
		//Comprovem si aquest any ja ha estat el seu aniversari.
		if(dataActual.get(GregorianCalendar.MONTH)==dataNaix.get(GregorianCalendar.MONTH)){
			if(dataActual.get(GregorianCalendar.DAY_OF_MONTH)>= dataNaix.get(GregorianCalendar.DAY_OF_MONTH)){
				anys=anys+1;
			}
		}else if(dataActual.get(GregorianCalendar.MONTH)>dataNaix.get(GregorianCalendar.MONTH)){
			anys=anys+1;
		}
		return anys;
	}
	
	//Veure les notes de l'alumne
	public void visualitzarNotes(){
		System.out.println(NomCognoms+
				"\n **********************\n"
				+assig1.getNom()+": "+ assig1.getQualificacio()+"" + "\n"
				+assig2.getNom()+": "+assig2.getQualificacio()+"\n"
				+assig3.getNom()+": "+assig3.getQualificacio());
	}
	
	

}
