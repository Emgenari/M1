
public class Fase4 {
	public static void main(String[] args) {
		String nom="Juan", cognom1="Garcia", cognom2="Lopez";
		int dia=25, mes=5, any=2000;
		System.out.println("El teu nom es "+nom+" "+cognom1+" "+cognom2);
		System.out.println("Vaig néixer el "+dia+"/"+mes+"/"+any);
		if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0)))
			System.out.println("El meu any de naixement és de traspàs");
		else
			System.out.println("El meu any de naixement és de traspàs");	
	}

}
