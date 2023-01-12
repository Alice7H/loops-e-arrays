package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Numa eleição existem três candidatos.
 * Faça um programa que peça o número total de eleitores.
 * Peça para cada eleitor votar e ao final mostrar
 * o número de votos de cada candidato.
 */

public class Ex26_Votacao {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Número de eleitores:");
    int eleitores = scan.nextInt();

    int contadorCandidato1 = 0;
    int contadorCandidato2 = 0;
    int contadorCandidato3 = 0;

    for (int i = 1; i <= eleitores; i++) {
      System.out.println("Vote no candidato:");
      System.out.println("1 , 2 ou 3");
      int candidato = scan.nextInt();

      while (candidato < 1 || candidato > 3) {
        System.out.println("Vote no candidato:");
        System.out.println("1 , 2 ou 3");
        candidato = scan.nextInt();
      }

      if (candidato == 1) {
        contadorCandidato1++;
      } else if (candidato == 2) {
        contadorCandidato2++;
      } else {
        contadorCandidato3++;
      }
    }

    System.out.println("Votos do candidato 1: " + contadorCandidato1);
    System.out.println("Votos do candidato 2: " + contadorCandidato2);
    System.out.println("Votos do candidato 3: " + contadorCandidato3);
  }
}
