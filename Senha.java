package atividade9DoWhile;
import java.util.Scanner;


public class Senha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "Chiquinho";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCorreta));
    
   
    sc.close();
}
    
}
