package JavaLista8;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;

        while (contador <= 20) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é PAR.");
            } else {
                System.out.println("O número " + numero + " é ÍMPAR.");
            }

            contador++;
        }

        scanner.close();
    }
}