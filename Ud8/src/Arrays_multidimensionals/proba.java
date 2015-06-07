package Arrays_multidimensionals;

public class proba {

	public static void main(String[] args) {
		
		int[][]array=new int[9][5];
		
		
		for (int i=0; i<9; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j]=(int)(Math.random()*(20-0)+1);
			}
		}
	
		for (int i=0; i < +9;i++){ //recorre les files (i marca les files9
			System.out.println();
			
			for (int j = 0; j < 5; j++) {	//recore les columnes (j marca la columna)
				System.out.print(i+j +" \t");
	
			}
		}

		for (int i=0; i < 5; i++){
			System.out.println("ProbA "+i);
		}
	}
}