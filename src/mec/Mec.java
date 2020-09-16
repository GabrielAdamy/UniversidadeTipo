package mec;

import uniPublica.Publica;
import universidade.Universidade;
import uniPrivada.Privada;

public class Mec {

	public void imprimeUniversidade(Universidade[] uni) {
		for (int i = 0; i < uni.length; i++) {

			if (uni[i] instanceof Publica) {
				System.out.println("A universidade é Publica");
				System.out.println("");
				uni[i].imprimeInfo();
				System.out.println("");
			}
			if (uni[i] instanceof Privada) {
				System.out.println("A universidade é Privada");
				System.out.println("");
				uni[i].imprimeInfo();
			}
		}
	}

	public void maisCara(Universidade[] uni) {
		if (uni == null || uni.length == 0) {
			System.out.println("Array de universidade vazio");
		}
		double mensalidade = 0;
		int maiorIndice = 0;
		for (int i = 0; i < uni.length; i++) {
			if (uni[i] instanceof Privada) {
				if (((Privada) uni[i]).getValorMensalidade() > mensalidade) {
					mensalidade = ((Privada) uni[i]).getValorMensalidade();
					maiorIndice = i;
				}
			}
		}
		if (uni[maiorIndice] instanceof Privada) {
			System.out.println("A universidade mais cara é: ");
			uni[maiorIndice].imprimeInfo();
		} else
			System.out.println("Universidade publica não possui mensalidade");
	}

	public void universidadesDoSul(Universidade[] uni) {
		for (int i = 0; i < uni.length; i++) {
			if (uni[i] instanceof Publica) {
				if (((Publica) uni[i]).getEstado().equalsIgnoreCase("RS")) {
					System.out.println("");
					System.out.println("Universidade do Rio Grande do Sul: ");
					uni[i].imprimeInfo();
				} else if (((Publica) uni[i]).getEstado().equalsIgnoreCase("SC")) {
					System.out.println("");
					System.out.println("Universidade de Santa Catarina: ");
					uni[i].imprimeInfo();
				} else if (((Publica) uni[i]).getEstado().equalsIgnoreCase("PR")) {
					System.out.println("");
					System.out.println("Universidade do Paraná: ");
					uni[i].imprimeInfo();
				}
			}
		}
	}

}
