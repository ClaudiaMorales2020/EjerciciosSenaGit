package EjerciciosGit;

import java.util.Scanner;

public class SintomasCovid19 
{
	//2 Realizar un ejercicio en donde se muestre un men� que diga
	//ingreso a la c�mara detectora del segundo s�ntoma del covid-19.
	//Por favor ingrese su temperatura, 
	//luego de ingresar la temperatura por teclado 
	//si esa temperatura es mayor a 37, imprima el mensaje 
	//" necesitas chequeo de un m�dico, pues tienes
	//uno de los s�ntomas de virus,"
	//" si su temperatura es menor a 37 imprima cuidate

	public static void main(String[] args) {

		int temperatura=0;
		int ResultadoTemperatura=0;
		
		System.out.println("ingreso a la c�mara detectora \n"
				          + " del segundo s�ntoma del covid-19 \n");
		System.out.println("Por favor ingrese su temperatura \n");
		
		Scanner entrada = new Scanner(System.in);
		temperatura=entrada.nextInt();
		
		if (temperatura>37) {
			
			System.out.println("necesitas chequeo de un m�dico \n, "
					+ "pues tienes uno de los s�ntomas de virus \n");
			
		}else{
			System.out.println("CUIDATE");
			
		}
		
		
	}

}
