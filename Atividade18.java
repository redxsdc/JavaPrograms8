package Atvidade8;

import java.util.Scanner;

public class Atividade18 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int cont,num,ultd;
        cont = 1;
        do {
            System.out.print("Digite o " + contador + "º número inteiro: ");
            num = sc.nextInt();
            ultd = num % 10;

            if (ultd == 0) {
                System.out.println("O último dígito é 0.");
            } else if (ultd == 5) {
                System.out.println("O último dígito é 5.");
            } else {
                System.out.println("O último dígito pertence a outra categoria (Valor: " + ultd + ").");
            }

            cont++;
        } while (cont <= 10);

        sc.close();
    }
}
