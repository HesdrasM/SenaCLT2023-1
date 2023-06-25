package Model;


public class CalculadoraIMC extends Pessoa {
    public CalculadoraIMC(String nome, int idade, double peso, double altura, String sexo) {
        super(nome, idade, peso, altura, sexo);
    }

    public void exibirResultadoIMC() {
        double imc = calcularIMC();
        System.out.println("O IMC de " + super.getNome() + " é: " + imc);
        System.out.println("Classificação: " + interpretarIMC(imc));
    }

    private String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}