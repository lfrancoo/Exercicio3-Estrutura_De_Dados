package view;

public class Fatorial {

    // Construtor da classe
    public Fatorial() {
        // Construtor utilizado para instanciar o objeto
    }

    // Metodo recursivo que calcula o fatorial de um número
    public int calcularFatorial(int n) {

        /*
         * CONDIÇÃO DE PARADA:
         * Quando n for igual a 0 ou 1, o fatorial é 1.
         */
        if (n == 0 || n == 1) {
            return 1;
        }

        /*
         * TERMO n EM FUNÇÃO DO TERMO ANTERIOR:
         * n! = n * (n - 1)!
         */
        return n * calcularFatorial(n - 1);
    }
}
