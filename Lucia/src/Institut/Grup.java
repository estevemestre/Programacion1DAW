package Institut;

import java.util.Scanner;

public class Grup {
	private static int codiTotal;
	private int codi;
	private String nom;
	private Alumnes alumnes[]=new Alumnes [10];
	
	static Scanner teclat=new Scanner(System.in);
	//constructor
	public Grup(){
		int num;
		this.codi=codiTotal+1;
		codiTotal=codiTotal+1; // sumem 1 grup m�s cada vegada que en creem un nou.
		System.out.println("Nom del curs:");
		this.nom=teclat.nextLine();
		System.out.println("N�mero d'alumnes del curs (m�x. 10):");
		num=Integer.parseInt(teclat.nextLine());
		//crear tants alumnes com diga l'usuari i clavar-los a l'array.
		if(Alumnes.verificaNAlumnes(num)){
			for (int i = 0; i < num; i++) {
			alumnes[i]=new Alumnes();
			}
		}
	}
	
	//getters i setters
	
	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Alumnes[] getAlumnes() {
		return alumnes;
	}

	public void setAlumnes(Alumnes[] alumnes) {
		this.alumnes = alumnes;
	}
	
	public static int getCodiTotal() {
		return codiTotal;
	}

	public static void setCodiTotal(int codiTotal) {
		Grup.codiTotal = codiTotal;
	}
	
	//buscar e el grup que se li passa, un alumne amb el seu codi (�s est�tic perqu� no cal dir-li sobre quin alumne aplicar-lo, ja busca ell l'alumne dins del m�tode)
	public static void buscarAlumne(Grup grup){
		int codi;
		boolean noPertany=false;
		
		System.out.println("Inserta el codi de l'alumne a buscar: ");
		codi=Integer.parseInt(teclat.nextLine());
		
		for (int i = 0; i < grup.getAlumnes().length; i++) {
			if(grup.getAlumnes()[i].getCodi()==codi){
				System.out.println("Codi \t Nom i cognoms\t \t Edat \t curs"
						+ "\n"+grup.getAlumnes()[i].getCodi()+"\t"+grup.getAlumnes()[i].getNom()+"\t \t"+grup.getAlumnes()[i].getEdat()+"\t"+grup.getNom());
			}else{
				noPertany=true;
			}
		}
		if(noPertany){ //ho far� quan siga true, �s a dir, quan no trobe cap alumne amb eixe codi en el grup que li passem.
			System.out.println("L'alumne no pertany al grup "+grup.getNom());
		}
		
	}
	
	/*//verificar que el codi del grup que busca, existeix.
	public static int verificarCodiGrup(int id){
		if(id<=Grup.getCodiTotal()){ 
			return id;
		}
		System.out.println("Codi de grup inv�lid.\n Inserta un codi de grup v�lid:");
		id=Integer.parseInt(teclat.nextLine());
		return verificarCodiGrup(id);
	}*/
	
}
