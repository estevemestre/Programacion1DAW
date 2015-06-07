package Practica_2;


import java.util.Scanner;


public class Practica2 {
	//Pr�ctica 2 part 2

		public static void main(String[] args) {
			int opcio;
			
			//declarem els objectes i els inicialitzem a null per a poder-los utilitzar. (es crearan despr�s)
			AssignaturaP2 assig1=null;
			AssignaturaP2 assig2=null;
			AssignaturaP2 assig3=null;
			AlumneP2 al1=null;
			ProfessorP2 profe1=null;	
			
			Scanner teclat=new Scanner(System.in);
					
			do{
				System.out.println("\n Sel�lecciona una opci�:\n "+
						"  GESTI� D'UN CENTRE \n "+
						"======================= \n "+
						"1.Insertar assignatures.\n "+
						"2.Insertar alumne.\n "+
						"3.Insertar professor.\n " +
						"4.Posar notes.\n "+
						"5.Calcular mitjana.\n "+
						"0.Eixir\n");
				opcio=Integer.parseInt(teclat.nextLine());
				
				switch(opcio){
				case 1:
					//crear� tres assignatures. Es demanar� a l'usuari el codi i el nom de cada una d'elles
					 assig1 = new AssignaturaP2();
					 assig2 = new AssignaturaP2();
					 assig3 = new AssignaturaP2();
					break;
				
				case 2:
					/*crear� un alumne. Se li demanar� el nom, l'e-mail i la data de naixement(dia, mes i any per separat)
					i despr�s crear� l'alumne amb estes dades i les assignatures creades en l�opci� n�mero 1*/
					
					//crea l'objecte i posa les assignatures per defecte
					al1=new AlumneP2();
					
					//assignem les assignatures anteriors a l'alumne creat.
					al1.setAssig1(assig1);
					al1.setAssig2(assig2);
					al1.setAssig3(assig3);
					break;
					
				case 3:
					//crear� un professor. Se li demanar� el nom i l'e-mail.
					profe1=new ProfessorP2();
					break;
					
				case 4:
					/*introduir les qualificacions de les assignatures de l'alumne. S'haur� de visualitzar el nom de l'alumne i a 
					 * continuaci�, una per una, demanar el nom de cada assignatura i la nota.*/
					
					profe1.insertarNotes(al1);
					break;
					
				case 5:
					
					//mostrar les qualificacions de l'alumne i calcular la mitjana.
					
					al1.visualitzarNotes();
					
					al1.comprovaMitjana(al1.calcularMitjana());
					break;
					
				case 0:
					System.out.println("Fins prompte.");
					break;
					
				default:
					System.out.println("Opci� no v�lida");
					break; 
				}
				
			}while (opcio!=0);
			
		}
	}	


