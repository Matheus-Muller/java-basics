package desafios;

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        int a;
        int n;
        int aAtual;
        int soma = 0;

        Scanner leitor = new Scanner(System.in);

        a = leitor.nextInt();
        n = leitor.nextInt();

        aAtual = a;

        while (aAtual <= n){
            if (aAtual % a == 0){
                soma = soma + aAtual;
            }
            aAtual ++;
        }

        System.out.println(soma);

        leitor.close();
    }
}
