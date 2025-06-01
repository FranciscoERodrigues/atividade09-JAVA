package atividade9DoWhile;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        do {
            System.out.println(num);
            num--;
        } while (num >= 0);
        
        sc.close();
}
}