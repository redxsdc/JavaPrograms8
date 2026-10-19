package Atvidade8;

import java.util.Scanner;

public class Atividade16 {
    static void main() {
        int numero,div,divE;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
         numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
        } else {
            div = 2;
            divE = 0;

            do {
                if (numero != 2) {
                    if (numero % div == 0) {
                        divE++;
                    }
                    div++;
                }
            } while (div < numero);

            if (divE == 0) {
                System.out.println("O número " + numero + " é PRIMO.");
            } else {
                System.out.println("O número " + numero + " NÃO é primo.");
            }
        }
        scanner.close();
    }
    }

