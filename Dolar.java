package cofre_moedas;

public class Dolar extends Moeda{
    private static final double TAXA_CONVERSAO = 5.73; // Valor do Dólar em: 22/03/2025

    public Dolar(double valor){
        super(valor);
    }

    @Override
    public double converterParaReal(){
        return valor * TAXA_CONVERSAO;
    }

    @Override
    public String toString(){
        return "Dólar: US$ " + String.format("%.2f", valor);
    }
}
