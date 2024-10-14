package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		ContactarSelecionado();
	}

	static void ContactarSelecionado() {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}

	static void entrandoEmContato(String candidato) {
		int tentativaRealizada = 1;
		boolean continuaTentando = true;
		boolean atendeu = false;
		do {

			// elas precisarão sofrer alterações

			atendeu = atender();
			continuaTentando = !atendeu;
			if (continuaTentando) {
				tentativaRealizada++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}

		} while (continuaTentando && tentativaRealizada < 3);
		
			if(atendeu) {
				System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativaRealizada + " TENTATIVA");
			}else {
				System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativaRealizada);
			}
		
		
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	static void imprimirSelecionados() {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
		System.out.println("Imprimir os candidatos selecionados infomando o indice do elemento");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + indice + " é " + candidatos[indice]);
		}

		System.out.println("Forma abreviada de interacao for each");

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}

	static void selecaoCandidatos() {

		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
				"DANIELA", "JORGE" };

		int candidatosSelecionados = 0;

		int candidatoAtual = 0;

		double salarioBase = 2000.0;

		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " Solicitou este valor " + salarioPretendido);

			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			} else {
				System.out.println("O candidato " + candidato + " não foi selecionado");
			}
			candidatoAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
