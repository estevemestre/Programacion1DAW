/*Crea un vector V numèric de 50 elements i un altre P de 20 elements.
 *  A continuació genera M(50,20) de tal forma que M(i,j) és igual a V(i)*P(j).
 */
package Arrays_multidimensionals;

public class Activitat19 {
	public static void main(String[] args) {
			
		int[] v= new int[50];
			
		for (int i = 0; i < v.length; i++) {
			v[i]=(int)(Math.random()*(5-0)+1);
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+ "\t");
		}
	System.out.println();
	System.out.println("*************************************************************************************************");
		//___________________________________________________
		int[] p =new int[20];
		for (int i = 0; i < p.length; i++) {
			p[i]=(int)(Math.random()*(5-0)+1);
		}		
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]+ "\t");
		}
		//__________________________________________________________________	
		System.out.println();
		System.out.println("**********************************************************************************************");
		int [][] m=new int [50][20];
		
		for (int i = 0; i < m.length; i++) { 
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=v[i]*p[j];
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j <m[i].length; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
}
		
		

