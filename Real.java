package cofre_moedas;

public class Real extends Moeda{
    public Real(double valor){
        super(valor);
    }
    
    
    @Override
    public double converterParaReal(){
        return valor;
    }

    @Override
    public String toString(){
        return "Real: R$ " + String.format("%.2f", valor);
    }
}

