package examen2_1;

public class MainPacient {

	private static Pacient [] pacients= new Pacient [4];
	
	
	public static int[] edad () {
	
		int [] majorMenor = new int [2];
		int aux = 0;
		
		for (int i = 0; i < pacients.length; i++) {
			 
			if (pacients[i].getEdad() > aux){
				aux = pacients[i].getEdad();
			}
		
		}
		
		    majorMenor[0] = aux;  // Major 
		
		return majorMenor;
	}
	
	
	
	public static int[] quantitatHD () {
	
		
		int [] quantitatHD = new int [2];
		
		for (int i = 0; i < pacients.length; i++) {
		
		//	if (pacients[i].getSexe().equals.(h)
		}
		return null; // No ma donat temps per acabar-ho
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
