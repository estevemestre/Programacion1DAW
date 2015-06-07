package MantenimentEmpresa;
import java.util.Scanner;

public class MantenimentEmpresa {

	static Scanner reader=new Scanner(System.in);
		
	
	static void menuPrincipal(){
		int option=0;
		Empresa empresa = null;
		Empleat emp = null;
		
		do{
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("1.-Crear empresa.");
			System.out.println("2.-Modificar sou empleat.");
			System.out.println("3.-Visualitzar informació de l'empresa.");
			System.out.println("0.-Eixir.");
			System.out.print("Inserta opció vàlida: ");
			option=Integer.parseInt(reader.nextLine());
			
			switch (option) {
			
			case 1:
			String pregunta;
			String resposta = "si";
			
			System.out.println("Tens un empleat ?");
			pregunta = reader.nextLine();
			
			 if (pregunta.equalsIgnoreCase(resposta)){
				 empresa = new Empresa();
			 }else {
				 System.out.println("No pots crear la empressa sense ningun empleat ");
			 }
				break;
			case 2:
				if (empresa.buscarEmpleat() != null) {
				empresa.buscarEmpleat().modificarSou();
				}else{
					System.out.println("La id no s'ha trobat");
				}
				break;
			case 3:
				empresa.mostrarInfo();
				break;
			case 0:
				System.out.println("Aplicació finalitzada.");
				break;
			default:
				System.out.println("Opció no vàlida.");
				break;
			}
		} while (option!=0);
	}
	
	
	public static void main(String[] args) {

		menuPrincipal();
		
	}
}
