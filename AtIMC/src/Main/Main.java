package Main;

import Model.CalculadoraIMC;

public class Main {
    public static void main(String[] args) {
        CalculadoraIMC calculadoraHomem = new CalculadoraIMC("João", 30, 70, 1.75, "masculino");

        calculadoraHomem.exibirInformacoes();
        calculadoraHomem.exibirResultadoIMC();

        System.out.println();

        CalculadoraIMC calculadoraMulher = new CalculadoraIMC("Maria", 25, 60, 1.65, "feminino");

        calculadoraMulher.exibirInformacoes();
        calculadoraMulher.exibirResultadoIMC();
    }
}
