import java.util.Scanner;
	
public class Exercicio1{
	public static void main(String[] args){

		
		String nome = "Maria de Souza";
		String produto1 = "Computador";
		String produto2 = "Celular";


		int idade = 28;
		int codigo = 1234;

		char sexo = 'F';

		double preco1 = 5900.18;
		double preco2 = 415.25;
		double soma = preco1 + preco2;

		System.out.printf("===== Dados do Comprador =====\n nome: %s \n idade: %d \n codigo: %d \n sexo: %c",
		nome, idade, codigo, sexo);

		System.out.println("\n===== Lista de Produtos ===== \n produto1: " +produto1+" | Preço: "+preco1+ "\n produto2: "+produto2+ " | Preço:"+preco2);
		System.out.println("===== Valor Total das Compras =====\n" +soma);



	}
}

