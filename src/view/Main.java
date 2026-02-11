package view;

import java.util.Scanner;
import controller.Fatorial;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para calcular o fatorial (máx. 12): ");
        int n = sc.nextInt();

        // Validação simples para evitar estouro
        if (n < 0 || n > 12) {
            System.out.println("Número inválido! Informe um valor entre 0 e 12.");
        } else {

            // Instanciando a classe Fatorial
            Fatorial fatorial = new Fatorial();

            int resultado = fatorial.calcularFatorial(n);

            System.out.println("Fatorial de " + n + " é: " + resultado);
        }

        sc.close();
    }
}
