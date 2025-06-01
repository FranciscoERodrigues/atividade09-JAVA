package atividade9DoWhile;

import java.util.Scanner;

public class MediaNotas {
        public static void main(String[] args) {
           
			Scanner sc = new Scanner(System.in);
			double nota, soma = 0;
			int count = 0;
			
			do {
			    System.out.print("Digite uma nota de 0 a 10: ");
			    nota = sc.nextDouble();
			    if (nota >= 0 && nota <= 10) {
			        soma += nota;
			        count++;
			    }
			} while (nota >= 0 && nota <= 10);
			
			if (count > 0) {
			    System.out.println("Média: " + (soma / count));
			} else {
			    System.out.println("Nota invalida");
			}
            sc.close();
        }
    }

