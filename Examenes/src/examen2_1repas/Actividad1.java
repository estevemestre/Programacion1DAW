
/*/*Crea un m�toode per a crear un array S amb els elements de P(array que rebr� com a par�metre)
que siguen majors de 20 ( quant els elements siguen <=20, es posar� un -1) El m�tode ha de retornar
l'array "clonat"
Des del main():
Crea un array P de 10 elements num�rics ( n�meros aleatoris entre 0 i 100)
Visualitza el contingu de l'array creat en una �nica instrucci�.
Crida al m�tode anterior i visualitza el resultat, en una �nica instrucci�.
*/


package examen2_1repas;
import java.util.Arrays;
public class Actividad1 {

	
	public static void main(String[] args) {
		
		
		int [] p = new int [10];
		
		for (int i = 0; i < p.length; i++) {
			
			p[i] = (int)Math.round(Math.random()*100);
		}
		
		System.out.println(Arrays.toString(p));
		
		System.out.println(Arrays.toString(clonat (p)));
	}
		
		
		public static int [] clonat (int[] p) {
			
			
			int [] s = new int [p.length];
			
		
				for (int i = 0; i < s.length; i++) {
				
					if (p[i]  > 20) {
						
						 s[i] = p[i];
						
					}else{
					
						 s[i] = -1;
					}
					
				}	
		
			return s;			
					
				
		
		
				
		}
	
}

