package br.com.dio.exercicios.loops.listaExercicios;
/*
 * Faça um programa que calcule o valor total
 * investido por um colecionador em sua coleção
 * de CDs e o valor médio gasto em cada um deles.
 * O usuário deverá informar a quantidade de CDs e
 * o valor para em cada um.
 */

import java.util.Scanner;

public class Ex28_ColecaoCd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantidade de CDs: ");
    int quantidadeCDs = scanner.nextInt();

    double gastoPorCD;
    double mediaGasto = 0;
    double totalInvestido = 0;

    for (int i = 0; i < quantidadeCDs; i++) {
      System.out.println("Valor gasto por CD: ");
      gastoPorCD = scanner.nextDouble();

      totalInvestido += gastoPorCD;
    }
    mediaGasto = totalInvestido / quantidadeCDs;
    System.out.println("Investimento: " + totalInvestido);
    System.out.println("Média de gasto:" + mediaGasto);
  }
}
