package Examen;

public class Act5 {
	public static int [] mayorMenor(Pacient [] pacientes){
		int [] extremos = new int [2];
		for (int count = 0; count < pacientes.length; count++) {
			if(pacientes[count].getEdad() < pacientes[extremos[0]].getEdad()){
				extremos[0] = count;
			}
		}
		for (int count = 0; count < pacientes.length; count++) {
			if(pacientes[count].getEdad() > pacientes[extremos[1]].getEdad()){
				extremos[1] = count;
			}
		}
		return extremos;
	}
	
	public static int [] hoD(Pacient [] pacientes){
		int [] cantidad = new int [2];
		for (int count = 0; count < pacientes.length; count++) {
			if(pacientes[count].getSexo() == 'H') cantidad[0]++;
			if(pacientes[count].getSexo() == 'D') cantidad[1]++;
		}
		return cantidad;
	}
	public static void main(String[] args) {
		Pacient [] pacientes = new Pacient[5];
		pacientes[0] = new Pacient(30, 'H', 1.60, 67.0);
		pacientes[1] = new Pacient(20, 'D', 1.70, 80.0);
		pacientes[2] = new Pacient(15, 'D', 1.50, 55.0);
		pacientes[3] = new Pacient(52, 'H', 1.80, 50.0);
		pacientes[4] = new Pacient(20, 'D', 1.70, 60.0);
		
		System.out.println("ESTADISITIQUES\n===================");
		System.out.println();
		System.out.println("PACIENT MAJOR\t"
				+ pacientes[mayorMenor(pacientes)[1]].getEdad() + "\t"
				+  pacientes[mayorMenor(pacientes)[1]].getSexo());
		System.out.println("PACIENT MENOR\t"
				+ pacientes[mayorMenor(pacientes)[0]].getEdad() + "\t"
				+  pacientes[mayorMenor(pacientes)[0]].getSexo());
		System.out.println();
		System.out.println("Quantitat de pacients per sexes:");
		System.out.println("Homes: " + hoD(pacientes)[0]
				+ "\tDones: " + hoD(pacientes)[1]);
		System.out.println();
		for (int count = 0; count < pacientes.length; count++) {
			System.out.println("Pacient numero " + (count+1) + ": " + pacientes[count].indiceIMC());
		}
	}
}
