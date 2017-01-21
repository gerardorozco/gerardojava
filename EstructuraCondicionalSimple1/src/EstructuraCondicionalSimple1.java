import java.util.Scanner;

public class EstructuraCondicionalSimple1 {
	
	static Scanner teclado;
	
	public static void main(String[] args)
	{
		teclado = new Scanner(System.in);
		float Sueldo;
		System.out.print("Ingrese Sueldo : ");
		Sueldo = teclado.nextFloat();
		if(Sueldo > 3000)
		{
			System.out.print("Debe abonar impuesto");
		}
		else
		{
			System.out.print("No debe abonar impuestos");
		}
	}	
}
