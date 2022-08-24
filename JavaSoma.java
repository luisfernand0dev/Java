import java.util.Scanner;
	
public class JavaSoma
{
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		int soma;

		Scanner somaNumero = new Scanner(System.in);
		System.out.println("Digite o 1º Número: ");
			num1 = somaNumero.nextInt();

		System.out.println("Digite o 2º Número: ");
			num2 = somaNumero.nextInt();

		soma = num1 + num2;
		System.out.println("A Soma entre os dois números é: " +soma);

	}
}