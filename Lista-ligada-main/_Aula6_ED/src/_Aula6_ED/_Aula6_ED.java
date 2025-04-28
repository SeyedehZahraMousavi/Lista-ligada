package _Aula6_ED;

import java.util.LinkedList;
import java.util.Scanner;

//Classe __Aula6_ED: encarregada de executar alguns testes/funcionalidades
//com a estrutura de dados LinkedList.
//Autores: Ivan Carlos Alcântara de Oliveira e Jean Marcos Laine.
//Autor 2: Seyedehzahra Mousavi 10441352
//Data da Atualização: 28/4/2025

public class _Aula6_ED {
	
	private static Scanner ler = new Scanner(System.in);
	
	// bancoDeDados(LinkedList<Trabalhador> func): realiza o cadastro de 10
	//  trabalhadores na lista ligada (LinkedList) func.
	public static void bancoDeDados(LinkedList<Trabalhador> func) {
		func.addLast(new Trabalhador(1, 25, 'M', 5000.0f, "Analista Jr."));
		func.addLast(new Trabalhador(2, 22, 'M', 3000.0f, "Auxiliar Administrativo."));
		func.addLast(new Trabalhador(3, 27, 'F', 5000.0f, "Analista Jr."));
		func.addLast(new Trabalhador(4, 35, 'M', 7000.0f, "Programador Sr."));
		func.addLast(new Trabalhador(5, 45, 'F', 7000.0f, "Gerente Jr."));
		func.addLast(new Trabalhador(6, 51, 'M', 7500.0f, "Gerente Pleno"));
		func.addLast(new Trabalhador(7, 60, 'M', 8000.0f, "Vice-Presidente"));
		func.addLast(new Trabalhador(8, 34, 'F', 7000.0f, "Analista Pleno"));
		func.addLast(new Trabalhador(9, 43, 'F', 8000.0f, "Programador Sr."));
		func.addLast(new Trabalhador(10, 63, 'F', 10000.0f, "Presidente"));
	}
	
	// demiteFuncionarios(LinkedList<Trabalhador> func): remove funcionários demitidos da lista
	//   de funcionários da empresa enquanto o usuário desejar.
	public static void demiteFuncionarios(LinkedList<Trabalhador> func) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Digite o ID do funcionário a ser demitido (ou -1 para sair): ");
			int id = scanner.nextInt();
			if (id == -1) {
				break;
			}
			boolean found = false;
			for (int i = 0; i < func.size(); i++) {
				if (func.get(i).getId() == id) {
					func.remove(i);
					System.out.println("Funcionário ID encontrado e removido com sucesso!");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Funcionário ID não foi encontrado!");
			}
		}
	}

    public static void main(String[] args) {
LinkedList<Trabalhador> func = new LinkedList<Trabalhador>();

bancoDeDados(func);
System.out.println("Lista inicial de funcionários:");
System.out.println(func);

LinkedList<Trabalhador> contratados = new LinkedList<Trabalhador>();

contratados.addLast(new Trabalhador(11, 23, 'M', 3900.0f, "Programador Jr."));
contratados.addLast(new Trabalhador(12, 29, 'F', 4500.0f, "Secretária Bilíngue"));
contratados.addLast(new Trabalhador(13, 35, 'M', 6000.0f, "Programador Pleno"));
contratados.addLast(new Trabalhador(14, 53, 'M', 5000.0f, "Programador Jr."));
contratados.addLast(new Trabalhador(15, 63, 'F', 8000.0f, "Analista Sr."));
contratados.addLast(new Trabalhador(16, 56, 'M', 9000.0f, "Analista Sr."));

/* *** Testes para serem realizados após a implementação dos métodos ****

func.concatena(contratados);
System.out.println("\nLista após contratações:");
System.out.println(func);

// Testando atualizaSalario
System.out.println("\n=== TESTE 1: Atualização de salário ===");
System.out.println("Atualizando salário do funcionário ID 11 para R$ 4200,00...");
boolean sucesso = func.atualizaSalario(11, 4200.0f);
System.out.println("Atualização realizada? " + (sucesso ? "Sim" : "Não"));

System.out.println("\nTentando atualizar ID inexistente (999):");
sucesso = func.atualizaSalario(999, 10000.0f);
System.out.println("Atualização realizada? " + (sucesso ? "Sim" : "Não"));

// Testando filtrarPorCargo
System.out.println("\n=== TESTE 2: Filtragem por cargo ===");
System.out.println("Filtrando 'Programador Jr.':");
LinkedList<Trabalhador> programadoresJr = func.filtrarPorCargo("Programador Jr.");
System.out.println(programadoresJr);

System.out.println("\nFiltrando 'Analista Sr.':");
LinkedList<Trabalhador> analistasSr = func.filtrarPorCargo("Analista Sr.");
System.out.println(analistasSr);

// Demissões
System.out.println("\n=== PROCESSO DE DEMISSÕES ===");
demiteFuncionarios(func);
System.out.println("\nLista final após demissões:");
System.out.println(func);

*** */
    }
}
	
	
