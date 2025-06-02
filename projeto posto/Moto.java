package ProjetoPosto;

public class Moto extends Veiculo {
	
	//Construtor
    public Moto(String placa, double litrosAbastecidos) {
        super(placa, litrosAbastecidos);
    }

//retorna o tipo do veículo como moto
    @Override
    public String tipo() {
        return "Moto";
    }
}

