package JavaLista8;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int totalPares = 0;
        int totalImpares = 0;
        while (contador <= 12) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
            contador++;
        }
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Quantidade de pares: " + totalPares);
        System.out.println("Quantidade de ímpares: " + totalImpares);

        scanner.close();
    }
}