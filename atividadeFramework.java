package revisao;

import java.util.Random;

public class AventuraDragao {

	public static void main(String[] args) {
		int vidaJogador = 100;
		Random random = new Random();
		int rodada = 1;

		System.out.println("Aventura do Dragão");
		System.out.println("Você começa com 100 de vida!");

		while (vidaJogador > 0) {
			int dano = random.nextInt(16) + 5;
			vidaJogador -= dano;

			if (vidaJogador < 0) {
				vidaJogador = 0;
			}

			System.out.println("Rodada " + rodada + " - O dragão atacou e causou " + dano + " de dano!");
			System.out.println("Vida restante: " + vidaJogador);
			rodada++;
		}

		System.out.println("Você foi derrotado pelo dragão!");
	}
}