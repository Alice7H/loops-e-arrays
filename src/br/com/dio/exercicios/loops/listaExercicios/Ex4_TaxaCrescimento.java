package br.com.dio.exercicios.loops.listaExercicios;

/*
 * Supondo que a população de um país A seja da ordem de 80000 habitantes
 * com uma taxa anual de crescimento de 3%
 * e que a população de B seja 200000 habitantes
 * com uma taxa de crescimento de 1.5%.
 * Faça um programa que calcule e escreva o número de anos necessários
 * para que a população do país A ultrapasse ou iguale a população do país B,
 * mantidas as taxas de crescimento.
 *
*/
public class Ex4_TaxaCrescimento {
  public static void main(String[] args) {
    double populacaoA = 80000;
    double populacaoB = 200000;
    double taxaAnualCrescimentoA = 1.03;
    double taxaAnualCrescimentoB = 1.015;
    int anos = 0;

    do {
      populacaoA *= taxaAnualCrescimentoA;
      populacaoB *= taxaAnualCrescimentoB;
      anos++;
    } while (populacaoA < populacaoB);

    System.out.println(populacaoA);
    System.out.println(populacaoB);
    System.out.println(anos);
  }
}
