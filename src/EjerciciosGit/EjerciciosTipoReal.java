package EjerciciosGit;

import java.util.Scanner;

public class EjerciciosTipoReal 
{
	//1 Realizar un ejercicio en donde se pida un dato de tipo
	//real(decimal) y lo divida entre 100, 
	//la respuesta debe ser de tipo float.

	public static void main(String[] args)
	{
		
		double numeroReal=0;
		double resultado1=0;
		float resultadoAmostrar=0;
    
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("------------EJERCICIO 1---------");
		System.out.println("--------------------------------");
		System.out.println();
		
		System.out.println("Por favor ingrese un numero tipo real");
		Scanner entrada = new Scanner(System.in);
		numeroReal= entrada.nextDouble();
		
		System.out.println();
		System.out.println("Diviendo numero entre 100");	
		resultado1=numeroReal/100;
		resultadoAmostrar=(float)resultado1;
		
		
		System.out.println();
		System.out.println("Este es el resultado del numero "
				+ "convertido de decimal a float: \n" + resultadoAmostrar);
		
		
		
	}

}
