package EjerciciosGit;

import java.util.Scanner;

public class SintomasCovid19 
{
	//2 Realizar un ejercicio en donde se muestre un menú que diga
	//ingreso a la cámara detectora del segundo síntoma del covid-19.
	//Por favor ingrese su temperatura, 
	//luego de ingresar la temperatura por teclado 
	//si esa temperatura es mayor a 37, imprima el mensaje 
	//" necesitas chequeo de un médico, pues tienes
	//uno de los síntomas de virus,"
	//" si su temperatura es menor a 37 imprima cuidate

	public static void main(String[] args) {

		int temperatura=0;
		int ResultadoTemperatura=0;
		
		System.out.println("ingreso a la cámara detectora \n"
				          + " del segundo síntoma del covid-19 \n");
		System.out.println("Por favor ingrese su temperatura \n");
		
		Scanner entrada = new Scanner(System.in);
		temperatura=entrada.nextInt();
		
		if (temperatura>37) {
			
			System.out.println("necesitas chequeo de un médico \n, "
					+ "pues tienes uno de los síntomas de virus \n");
			
		}else{
			System.out.println("CUIDATE");
			
		}
		
		
	}

}
