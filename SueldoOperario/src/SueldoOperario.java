import java.util.Scanner;

public class SueldoOperario {
	
	private static Scanner teclado;

	public static void main(String args[])
	{
		teclado = new Scanner(System.in);
		int horasTrabajadas;
		float costoHora;
		float Sueldo;
		System.out.print("Ingrese la cantidad de horas trabajadas : ");
		horasTrabajadas = teclado.nextInt();
	    System.out.print("Ingrese el valor de la hora : ");
	    costoHora = teclado.nextFloat();
	    Sueldo = horasTrabajadas * costoHora;
	    System.out.print("El empleado debe cobrar : " + Sueldo);
	}
}
