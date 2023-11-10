/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
via teclado e mostre na tela o total de pessoas cuja idade ja menor que 21 anos
e o total de pessoas cuja idade seja maior que 50 anos.
A leitura dos dados deve ser finalizada ao digitar uma idade negativa.*/

package LacoDeRepeticaoExercicios;
import java.util.Scanner;

public class Ex01LacoDeRepeticaoWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade,totalMenor21=0,totalMaior50 = 0;
		
		System.out.printf("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >=0) {
			System.out.printf("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade <21) {
				totalMenor21++;
			}else if(idade>50) {
				totalMaior50++;
			}
			
			
		}
		
		 System.out.println("Total de pessoas menores de 21 anos: " + totalMenor21);
	     System.out.println("Total de pessoas maiores de 50 anos: " + totalMaior50);
	}
	

}
