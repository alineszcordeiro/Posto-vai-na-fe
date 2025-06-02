package ProjetoPosto;

public class Carro extends Veiculo {
	
	//Construtor 
    public Carro(String placa, double litrosAbastecidos) {
        super(placa, litrosAbastecidos);
    }

          //retorna o tipo do veículo como carro
    @Override
    public String tipo() {
        return "Carro";
    }
}

