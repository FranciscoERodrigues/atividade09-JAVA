package atividade9DoWhile;

import java.util.Scanner;

public class Fatorial {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = sc.nextInt();
            int i = numero;
            long fatorial = 1;

            do {
                fatorial *= i;
                i--;
            } while (i > 0);

            System.out.println("Fatorial de " + numero + " = " + fatorial);
            sc.close();
        }
    }

