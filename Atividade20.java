package Atvidade8;

import java.util.Scanner;

public class Atividade20 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int centavos, m25, m10, m5, m1;
        System.out.print("Digite o valor do troco em centavos: ");
        centavos = sc.nextInt();
        m25 = 0;
        m10 = 0;
        m5 = 0;
        m1 = 0;
        if (centavos > 0) {
            do {
                if (centavos >= 25) {
                    centavos -= 25;
                    m25++;
                } else if (centavos >= 10) {
                    centavos -= 10;
                    m10++;
                } else if (centavos >= 5) {
                    centavos -= 5;
                    m5++;
                } else {
                    centavos -= 1;
                    m1++;
                }
            } while (centavos > 0);
        }
        System.out.println("Menor número de moedas necessário:");
        System.out.println("Moedas de 25c: " + m25);
        System.out.println("Moedas de 10c: " + m10);
        System.out.println("Moedas de 5c: " + m5);
        System.out.println("Moedas de 1c: " + m1);
        sc.close();
    }
}
