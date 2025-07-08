package cofre_moedas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cofre cofre = new Cofre();
		
		while (true){	
			
			System.out.println("============ COFRINHO ============ \n");
			System.out.println("1 - Adicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Calcular total convertido para Real");
			System.out.println("0 - Sair");
			System.out.print(">> ");
			int opcao = teclado.nextInt();
			
			if(opcao == 0) {
				System.out.println("Saindo do cofrinho...");
				break;
			}
			else if(opcao == 1) {cofre.adicionarMoedas();}
			else if(opcao == 2) {cofre.removerMoedas();}
			else if(opcao == 3) {cofre.listarMoedas();}
			else if(opcao == 4) {cofre.calculoTotalReal();}
			else {
				System.out.println("Selecione uma opção válida e tente novamente!");
				System.out.print(">> ");
				opcao = teclado.nextInt();
			}
	}

	}

}
