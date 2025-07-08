package cofre_moedas;

public abstract class Moeda{
    protected double valor;
    
    public Moeda(double valor){
        this.valor = valor;
    }
    public abstract double converterParaReal();

    public double getValor(){
        return valor;
    }

    @Override
    public String toString(){
        return String.format("Moeda: %.2f", valor);
    }
}
