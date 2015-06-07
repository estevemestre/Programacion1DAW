package Arrays_multidimensionals;

public class probas {

	
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
			System.out.println("**********************************");
			
			int [][] segonaMatriu = new int [7][7];
			
	
		int j=0;
		
		for (int i = 0; i < matriu.length; i++) { 
			for(j = 0;j < matriu[i].length;j++) {
				segonaMatriu[i][j]=matriu[i][j];
			}
		}
		

		
		int suma=0;
		for (int i = 0; i < segonaMatriu.length; i++) {
			for (int l = 0; l < segonaMatriu[i].length; l++) {
				suma=suma+segonaMatriu[i][l];
			}
			segonaMatriu[i][j]=suma; //j perquè és la sexta columna
			suma=0;
		}
		
		
		
		
		//Guarda en la columna sèptima la mitjana de les 5 primeres columnes
		j++; //per a que la columna siga la 7 (6 en posició)
		
		for (int i = 0; i < segonaMatriu.length; i++) {
			segonaMatriu[i][j]=segonaMatriu[i][j-1]/matriu[i].length; 
		}
		
		
		

		for (int i = 0; i < segonaMatriu.length; i++) {
			System.out.println();
			for (int k = 0; k < segonaMatriu[i].length; k++) {
				System.out.println(segonaMatriu[i][k] +"\t");
			}
		}
		
		
	}

}
