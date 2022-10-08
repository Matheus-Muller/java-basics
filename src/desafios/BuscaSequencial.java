package desafios;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int n;
        int posicao = -1;

        n = leitor.nextInt();

        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == n)
                posicao = i;
        }

        if (posicao >= 0){
            System.out.println("Achei " + n + " na posicao " + posicao);
        } else {
            System.out.println("Numero " + n + " nao encontrado!");
        }

        leitor.close();
    }
}
