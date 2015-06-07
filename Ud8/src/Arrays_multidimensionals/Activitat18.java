/*Activitat18.- Crea una matriu de 7x5 i visualitza-la. A continuació:
Crea una nova matriu de 7x7 en la qual les 5 primeres columnes siguen les de la matriu origen.
Guarda en la sexta columna la suma de les 5 anteriors.
Guarda en la columna sèptima la mitjana de les 5 primeres columnes.
 */
package Arrays_multidimensionals;

public class Activitat18 {
	public static void main(String[] args) {
		
		int [][] matriu = {
			{1,1,1,1,1},
			{2,2,2,2,2},
			{3,3,3,3,3},
			{4,4,4,4,4},
			{5,5,5,5,5},
			{6,6,6,6,6},
			{7,7,7,7,7},
			};
		
		for (int i = 0; i < matriu.length; i++) {
			System.out.println();
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j]+ "\t");
			}
		}
		
		System.out.println();
		
		int [][] segonaMatriu = new int [7][7];
	
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[j].length; j++) {
				segonaMatriu[i][j] = 	matriu[i][j];
			}	
		}
		
		for (int i = 0; i < segonaMatriu.length; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
			 System.out.print(segonaMatriu[i][j]+ "\t");
			}
		}

		
	int suma=0;
	for (int i = 0; i < segonaMatriu.length; i++) {
		for (int l = 0; l < segonaMatriu[i].length; l++) {
			suma = suma + segonaMatriu[i][l];
		}
		//suma = segonaMatriu[][]; //j perquè és la sexta columna
		suma=0;
	}
		
		
	}
}

