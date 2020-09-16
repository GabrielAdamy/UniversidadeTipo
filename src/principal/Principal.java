package principal;

import java.util.Scanner;

import mec.Mec;
import uniPrivada.Privada;
import uniPublica.Publica;
import universidade.Universidade;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas Universidades serão cadastradas? ");
		int a = sc.nextInt();
		Universidade uni[] = new Universidade[a];
		System.out.println("");

		int tam = uni.length;
		Mec m = new Mec();

		for (int i = 0; i < tam; i++) {
			System.out.println("");
			System.out.println("Opção 1 cria uma universidade Privada.");
			System.out.println("Opção 2 cria uma universidade Pública.");
			System.out.println("");

			System.out.println("Opção: ");
			int opcao = sc.nextInt();
			System.out.println("");
			if (opcao < 1 || opcao > 2) {
				System.out.println("Opção invalida!");
				--i;
			}
			if (opcao == 1) {
				for (int x = 0; x < 1; x++) {
					sc.nextLine();
					System.out.printf("Nome da Universidade: ");
					String n = sc.nextLine();
					System.out.println("");
					System.out.printf("Quantidade de Alunos: ");
					int qA = sc.nextInt();
					System.out.println("");
					System.out.printf("Quantidade de professores: ");
					int qP = sc.nextInt();
					System.out.println("");
					System.out.printf("Valor mensalidade: ");
					double vM = sc.nextDouble();

					uni[i] = new Privada(n, qA, qP, vM);
				}
			}

			if (opcao == 2) {
				for (int y = 0; y < 1; y++) {
					sc.nextLine();
					System.out.printf("Nome da Universidade: ");
					String n = sc.nextLine();
					System.out.println("");
					System.out.printf("Quantidade de Alunos: ");
					int qA = sc.nextInt();
					System.out.println("");
					System.out.printf("Quantidade de professores: ");
					int qP = sc.nextInt();
					System.out.println("");
					System.out.printf("Digite o estado: ");
					sc.nextLine();
					String e = sc.nextLine();
					System.out.println("");
					System.out.printf("Digite a cidade: ");
					String c = sc.nextLine();
					System.out.println("");
					uni[i] = new Publica(n, qA, qP, e, c);

				}
			}
		}
		sc.close();
		System.out.println("");

		m.imprimeUniversidade(uni);
		System.out.println("");

		m.maisCara(uni);
		System.out.println("");

		m.universidadesDoSul(uni);
		System.out.println("");
		

	}
}