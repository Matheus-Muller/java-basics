package desafios;

import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n;
        int soma = 0;

        n = leitor.nextInt();

        for (int i = n; i > 0; i--){
            soma += i;
        }

        System.out.println(soma);
        
        leitor.close();
    }
}
