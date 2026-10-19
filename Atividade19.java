package Atvidade8;

import java.util.Scanner;

public class Atividade19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto;
        int palpite;
        numeroSecreto = 42;
        palpite = 0;
        System.out.println("JOGO DA ADIVINHAÇÃO ");
        do {
            System.out.print("Digite o seu palpite: ");
            palpite = sc.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto " + numeroSecreto + "!");
            } else {
                if (palpite % 2 == 0) {
                    System.out.print("Dica: Seu palpite é PAR e ");
                } else {
                    System.out.print("Dica: Seu palpite é ÍMPAR e ");
                }

                if (palpite < numeroSecreto) {
                    System.out.println("MENOR que o número secreto.");
                } else {
                    System.out.println("MAIOR que o número secreto.");
                }
            }
        } while (palpite != numeroSecreto);
        sc.close();
    }
    }

