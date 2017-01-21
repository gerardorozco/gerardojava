import java.util.Scanner;

public class EstructuraCondicionalCompuesta1 {
	
	static Scanner teclado;
	
	public static void main(String[] args)
	{
		teclado = new Scanner(System.in);
		int num1, num2;
		System.out.print("Ingrese Primer Valor : ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese Segundo Valor : ");
		num2 = teclado.nextInt();
		if(num1>num2)
		{
			System.out.print(num1);			
		}
		else if(num1<num2)
		{
			System.out.print(num2);
		}
		else
		{
			System.out.print("Iguales");
		}
	}
}
