package Atvidade8;

public class Atividade17 {
    static void main() {
        int cont,soma;
        cont = 1;
        soma = 0;
        do {
            if (cont % 3 == 0 || cont % 5 == 0) {
                soma += cont;
            }
            cont++;
        } while (cont < 100);
        System.out.println("A soma de todos os múltiplos de 3 e 5 abaixo de 100 é: " + soma);
    }
}
