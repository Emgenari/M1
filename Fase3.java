
public class Fase3 {
	public static void main(String[] args) {
						for (int i = 1948; i <= 1981; i = i + 4) {
					System.out.println(i);
					}
						int any = 1981;
						if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0)))
							System.out.println(any + " es bisiesto");
						else
							System.out.println(any + " no es bisiesto");
				}
}