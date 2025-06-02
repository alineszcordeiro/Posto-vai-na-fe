package ProjetoPosto;

public abstract class Veiculo implements Abastecivel{
	
	private String placa; // Placa do veículo
    private double litrosAbastecidos;  // Quantidade de litros que o veículo vai abastecer

    public Veiculo(String placa, double litrosAbastecidos) {
        this.placa = placa;
        this.litrosAbastecidos = litrosAbastecidos;
    }

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getLitrosAbastecidos() {
		return litrosAbastecidos;
	}

	public void setLitrosAbastecidos(double litrosAbastecidos) {
		this.litrosAbastecidos = litrosAbastecidos;
	}

	@Override
    public void abastecerNaBomba(BombaCombustivel bomba, Funcionario funcionario) {
        double valor = bomba.abastecer(this);
        funcionario.receberPagamento(this, valor);
    }
 
    public abstract String tipo();
}