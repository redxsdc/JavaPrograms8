package JavaLista8;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int multiplosDeQuatro = 0;
        while (contador <= 15) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();
            if (numero % 4 == 0) {
                multiplosDeQuatro++;
            }
            contador++;
        }
        System.out.println("\nTotal de múltiplos de 4 digitados: " + multiplosDeQuatro);
        scanner.close();
    }
}