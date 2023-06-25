package Model;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private String sexo;
	
	public Pessoa(String nome, int idade, double peso, double altura, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public double calcularIMC() {
		if (sexo.equalsIgnoreCase("masculino")) {
			return calcularIMCHomem();
		} else if (sexo.equalsIgnoreCase("feminino")) {
			return calcularIMCMulher();
		} else {
            System.out.println("Sexo inválido");
            return 0.0;
        }
    }

    private double calcularIMCHomem() {
        return peso / (altura * altura);
    }

    private double calcularIMCMulher() {
        return peso / (altura * altura);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Sexo: " + sexo);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
    
}