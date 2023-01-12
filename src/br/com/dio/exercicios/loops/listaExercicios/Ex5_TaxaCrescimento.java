package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Altere o programa anterior permitindo ao usuário informar as populações
 * e as taxas de crescimento iniciais.
 * Valide a entrada e permita repetir a operação.
*/
public class Ex5_TaxaCrescimento {
  public static void main(String[] args) {
    double populacaoA;
    double populacaoB;
    double taxaAnualCrescimentoA;
    double taxaAnualCrescimentoB;
    boolean rodarProgramaNovamente = false;

    while (!rodarProgramaNovamente) {
      int anos = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Informe a quantidade de população A: ");
      populacaoA = scan.nextDouble();
      System.out.println("Informe a quantidade de população B: ");
      populacaoB = scan.nextDouble();

      System.out.println("Informe a taxa de crescimento da população A em %: ");
      taxaAnualCrescimentoA = scan.nextDouble();
      System.out.println("Informe a taxa de crescimento da população B em %: ");
      taxaAnualCrescimentoB = scan.nextDouble();

      while (taxaAnualCrescimentoA <= taxaAnualCrescimentoB) {
        System.out.println("Taxa da população B inválida");
        System.out.println("Informe a taxa de crescimento da população A em %: ");
        taxaAnualCrescimentoA = scan.nextDouble();
        System.out.println("Informe a taxa de crescimento da população B em %: ");
        taxaAnualCrescimentoB = scan.nextDouble();
      }

      taxaAnualCrescimentoA = (taxaAnualCrescimentoA / 100) + 1;
      taxaAnualCrescimentoB = (taxaAnualCrescimentoB / 100) + 1;

      do {
        populacaoA *= taxaAnualCrescimentoA;
        populacaoB *= taxaAnualCrescimentoB;
        anos++;
      } while (populacaoA < populacaoB);

      System.out.println(populacaoA);
      System.out.println(populacaoB);
      System.out.println(anos);

      System.out.print("Deseja rodar o programa novamente? [S/N] ");
      String repeat = scan.next();

      if (repeat.equalsIgnoreCase("n"))
        rodarProgramaNovamente = true;
    }
  }
}
