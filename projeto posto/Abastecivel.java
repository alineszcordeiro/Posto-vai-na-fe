package ProjetoPosto;

public interface Abastecivel {
	
	// Método que deve ser implementado para realizar o abastecimento na bomba
    // Recebe a bomba e o funcionário responsáveis pelo abastecimento
    void abastecerNaBomba(BombaCombustivel bomba, Funcionario funcionario);

}
