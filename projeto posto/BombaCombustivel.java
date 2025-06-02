package ProjetoPosto;

public class BombaCombustivel {
    private int id;
    private double precoLitro;
    private String tipoCombustivel;

    public BombaCombustivel(int id, double precoLitro, String tipoCombustivel) {
        this.id = id;
        this.precoLitro = precoLitro;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double abastecer(Veiculo v) {
        System.out.println("\nBomba " + id + " abasteceu " + v.tipo() +
            " " + v.getPlaca() + " com " + v.getLitrosAbastecidos() + "L de " + tipoCombustivel + ".");
        return v.getLitrosAbastecidos() * precoLitro;
    }

    public double getPrecoLitro() {
        return precoLitro;
}
}
