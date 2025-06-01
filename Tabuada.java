package atividade9DoWhile;

import java.util.Scanner;

public class Tabuada {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número para ver sua tabuada: ");
            int numero = sc.nextInt();
            int contadora = 1;

            do {
                System.out.println(numero + " x " + contadora + " = " + (numero * contadora));
                contadora++;
            } while (contadora <= 10);

            sc.close();
        }
    }

