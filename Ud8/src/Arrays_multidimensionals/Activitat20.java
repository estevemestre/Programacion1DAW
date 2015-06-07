/*Genera un quadrat llatí d'ordre N. Un quadrat llatí d'ordre N és una matriu quadrada en la qual 
 * la primera fila conté els N primers números naturals (>0), en ordre, i cada una de les files següents 
 * conté la rotació de la fila anterior un lloc a la dreta.
	1   2   3   4   5
	5   1   2   3   4
	4   5   1   2   3
	3   4   5   1   2
	2   3   4   5   1   

 * 
 */
package Arrays_multidimensionals;

public class Activitat20 {
	public static void main(String[] args) {
		
		int [] [] matriu=new int [5][5];
		int suma=0;
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (i>0){
					if(j==0){
						matriu [i][j]=matriu[i-1][matriu.length-1];
					}else{
						matriu[i][j]=matriu[i-1][j-1];
					}
				}else{
					matriu[i][j]= suma+1;
					suma++;
				}		
			}
		}
		
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu [i][j]+"\t");
			}
			System.out.println(" ");
		}
	}

}