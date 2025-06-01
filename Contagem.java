package atividade9DoWhile;

import java.util.Scanner;

public class Contagem {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String palavra;

            do {
                System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
                palavra = sc.nextLine().toLowerCase();

                if (!palavra.equals("sair")) {
                    int contador = 0;
                    for (char c : palavra.toCharArray()) {
                        if ("aeiou".indexOf(c) >= 0) {
                            contador++;
                        }
                    }
                    System.out.println("Quantidade de vogais: " + contador);
                }

            } while (!palavra.equals("sair"));

            sc.close();
        }
    }

