package atividade9DoWhile;

import java.util.Scanner;

public class SomaPositivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;

        do {
            System.out.print("Digite um número positivo: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
