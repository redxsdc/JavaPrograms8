package JavaLista8;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número limite: ");
        int limite = scanner.nextInt();
        int i = 1;
        System.out.println("Múltiplos de 3 e 5 ao mesmo tempo entre 1 e " + limite + ":");

        while (i <= limite) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}