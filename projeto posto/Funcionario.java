package ProjetoPosto;

public class Funcionario { // Classe que representa um funcionário do posto

	private String nome;  //Nome do funcionario
	
	// Construtor
	public Funcionario(String nome) {
        this.nome = nome;
    }


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Método que simula o recebimento do pagamento de um veículo
    public void receberPagamento(Veiculo v, double valor) {
    // Exibe mensagem informando que o funcionário recebeu o valor do veículo
    System.out.println("Funcionário " + nome + " recebeu R$" + String.format("%.2f", valor) + " do veículo " + v.getPlaca());    }

	
}
