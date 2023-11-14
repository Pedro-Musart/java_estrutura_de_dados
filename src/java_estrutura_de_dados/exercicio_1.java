package java_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio_1 {
	
	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<String>();
		
		Scanner input = new Scanner(System.in);
		int op;

		
		do {
			
			System.out.println("\nDigite uma das opções abaixos:\n\n"
					+ "1: Adicionar um novo Cliente na fila\n"
					+ "2: Listar todos os Clientes\n"
					+ "3: Chamar uma pessoa da fila\n"
					+ "0: Sair do programa\n\n"
					+ "Digite sua opção:");
			op = input.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("\nDigite o nome:");
				fila.add(input.next());
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				}else {
					System.out.println("\nLista de clientes na fila:");
					for(String nome:fila) {
						System.out.println(nome);
					}
				}
				break;
			case 3:
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				}else {
					System.out.println("O cliente " + fila.peek() + " foi chamado!");
					fila.remove(fila.peek());
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
				
				default:
					System.out.println("Opção inválida");
			}
			
		

		} while(op != 0);
		
	}
}
