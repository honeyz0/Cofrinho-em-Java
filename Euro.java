package cofre_moedas;

public class Euro extends Moeda{
    private static final double TAXA_CONVERSAO = 6.20; // Valor do Euro em: 22/03/2025

    public Euro(double valor){
        super(valor);
    }

    @Override
    public double converterParaReal(){
        return valor * TAXA_CONVERSAO;
    }

    @Override
    public String toString(){
        return "Euro: € " + String.format("%.2f", valor);
    }
}
