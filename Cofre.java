package cofre_moedas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cofre {
	private List<Moeda> moedas;

	public Cofre(){
		this.moedas = new ArrayList<>();
	}
	public void adicionarMoedas(){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha uma moeda: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro");
		System.out.print(">>");
		int moedaTipo = teclado.nextInt();
		
		while(moedaTipo < 1 || moedaTipo > 3){
			System.out.println("Selecione uma opção válida e tente novamente!");
			System.out.print(">>");
			moedaTipo = teclado.nextInt();
		}
			
		System.out.println("Digite o valor:");
		System.out.println(">>");
		double valor = teclado.nextDouble();
			
		Moeda moeda = null; 
		if(moedaTipo == 1){
			moeda = new Real(valor);
		}
		if(moedaTipo == 2){
			moeda = new Dolar(valor);
		}
		if(moedaTipo == 3){
			moeda = new Euro(valor);
		}
		
		moedas.add(moeda);
		System.out.println("Moeda adicionada: " + moeda);
	}	

	 public void removerMoedas(){
	        if(moedas.isEmpty()){
	        	System.out.println("O cofre está vazio!");
	        	return;
	        }

	        Scanner teclado = new Scanner(System.in);
	        System.out.println("Digite o valor da moeda a ser removida:");
	        System.out.print(">> ");
	        double valor = teclado.nextDouble();

	        Moeda moedaParaRemover = null;
	        for(Moeda moeda : moedas){
	            if(moeda.getValor() == valor){
	                moedaParaRemover = moeda;
	                break;
	            }
	        }

	        if(moedaParaRemover != null){
	            moedas.remove(moedaParaRemover);
	            System.out.println("Moeda removida: " + moedaParaRemover);
	        }
	        else{
	            System.out.println("Moeda não encontrada!");
	        }
	    }

	    public void listarMoedas(){
	        if (moedas.isEmpty()){
	            System.out.println("O cofrinho está vazio!");
	        } 
	        else {
	            System.out.println("Moedas no cofre:");
	            for (Moeda moeda : moedas){
	                System.out.println(moeda);
	            }
	        }
	    }

	    public void calculoTotalReal(){
	        double total = 0;
	        for (Moeda moeda : moedas){
	            total += moeda.converterParaReal();
	        }
	        
	        System.out.printf("Total em Reais: R$ %.2f%n", total);
	    }
	 
	}
	
