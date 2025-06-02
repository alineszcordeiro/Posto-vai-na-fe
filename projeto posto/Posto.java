package ProjetoPosto;

public class Posto {
	
	// Cada posto tem uma bomba de combustível e um funcionário responsável
    private BombaCombustivel bomba;
    private Funcionario funcionario;
    
    // Construtor que recebe a bomba e o funcionário que irão trabalhar juntos
	public Posto(BombaCombustivel bomba, Funcionario funcionario) {
		super();
		this.bomba = bomba;
		this.funcionario = funcionario;
	}
    
	// Método que atende um veículo
    public void atender(Abastecivel v) {
// O veículo é abastecido usando a bomba e o funcionário desse posto
        v.abastecerNaBomba(bomba, funcionario);
    }
}

