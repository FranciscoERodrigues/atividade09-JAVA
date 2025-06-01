package atividade9DoWhile;

import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 7;
        int tentativa;

        do {
            System.out.print("Tente adivinhar o número (1 a 10): ");
            tentativa = sc.nextInt();
        } while (tentativa != secreto);

        System.out.println("Parabéns!");
        sc.close();
    }
}
