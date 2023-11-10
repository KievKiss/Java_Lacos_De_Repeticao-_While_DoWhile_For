/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número 
 *deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela
 *informando que o intervalo é inválido e sair do programa.
 *No intervalo informado, mostre na tela todos os números que são múltiplos de 3 e 5*/


package LacoDeRepeticaoExercicios;
import java.util.Scanner;

public class Ex01LacoDeRepeticaoFor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int primeiroNumero, ultimoNumero;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNumero = leia.nextInt();
		
		System.out.println("Digite o utlimo número do intervalo: ");
		ultimoNumero = leia.nextInt();
		
		if(primeiroNumero >= ultimoNumero) {
			System.out.println("Intervalo invalido!");
			System.exit(0); 
		}else 
			{System.out.println("No intervalo entre" + primeiroNumero + "e" + ultimoNumero + ":");
		}
		// Verifica e exibe se os numero são multiplos de 3 e 5 no intervalo
		for (int i = primeiroNumero; i <= ultimoNumero; i++) {
			if(i % 3 ==0 && i %5 ==0) {
				System.out.println(i + " é multiplo de 3 e 5");
			
			}
		}
		
	}
	

}
