package java_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class exercicio_2 {
	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		Scanner input = new Scanner(System.in);
		int op;

		
		do {
			
			System.out.println("\nDigite uma das opções abaixos:\n\n"
					+ "1: Adicionar um Livro na Pilha\n"
					+ "2: Listar todos os Livros\n"
					+ "3: Retirar Livro da Pilha\n"
					+ "0: Sair\n\n"
					+ "Digite sua opção:");
			op = input.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("\nDigite o nome:");
				pilha.push(input.next());;
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				}else {
					System.out.println("\nLista de Livros na pilha:");
					for(String nome:pilha) {
						System.out.println(nome);
					}
				}
				break;
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				}else {
					System.out.println("O Livro " + pilha.peek() + " foi retirado!");
					pilha.remove(pilha.pop());
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

