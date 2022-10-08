package desafios;

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a, b;

        a = leitor.nextInt();
        b = leitor.nextInt();

        if (a == b){
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }

        leitor.close();
    }
}
