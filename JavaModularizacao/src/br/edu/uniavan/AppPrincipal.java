package br.edu.uniavan;

import java.util.Random;
import java.util.Scanner;

public class AppPrincipal {
	
	public static void main(String[] args) throws InterruptedException {
		
		int largura = 80;
		int altura = 100;
		int velocidade = 400;
		int quantidadeElementos = 0;
		boolean eNovaLinha = false;
		int quantidadeEspaco = 0;
		int quantidadeEspacoMaximo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		int novaPosicao;
		
		System.out.println("=== Simulador de pontos ===");
		
		System.out.println("Informe a largura da tela: ");
		largura = sc.nextInt();

		
		System.out.println("Informe a altura da tela: ");
		altura = sc.nextInt();		
		
		System.out.println("Informe a velocidade: ");
		velocidade = sc.nextInt();
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < largura; j++) {
				novaPosicao = rnd.nextInt(largura);
				if (j == novaPosicao) {
					System.out.print(".");
					quantidadeElementos++;
					quantidadeEspaco = 0;
				}else {
					System.out.print(" ");
					quantidadeEspaco++;
					if (quantidadeEspaco > quantidadeEspacoMaximo) {
						quantidadeEspacoMaximo = quantidadeEspaco;
					}
				}
			}
			Thread.sleep(velocidade);
			System.out.println();
		}
		
		
		System.out.println("=== Resultado do processamento ===");
		System.out.println("Quantidade de elementos: "+ quantidadeElementos);
		System.out.println("Quantidade máxima de espaço: "+ quantidadeEspacoMaximo);
		System.out.println("Largura: "+ largura);
		System.out.println("Altura: "+ altura);
	}
	

}
