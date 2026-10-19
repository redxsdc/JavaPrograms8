package JavaLista8;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            System.out.print("\nDigite o número (N): ");
            int n = scanner.nextInt();
            System.out.print("Digite o divisor (D): ");
            int d = scanner.nextInt();
            if (d == 0) {
                System.out.println("Erro: Não é possível dividir por zero.");
            } else if (n % d == 0) {
                System.out.println(n + " É divisível por " + d + " (resto = 0).");
            } else {
                System.out.println(n + " NÃO é divisível por " + d + " (resto = " + (n % d) + ").");
            }
            System.out.print("\nDeseja testar outro par? (S/N): ");
            continuar = scanner.next().charAt(0);
        }
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
