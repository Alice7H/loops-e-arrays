package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que receba dois números inteiros e gere os números inteiros
 * que estão no intervalo compreendido por eles.
*/

public class Ex10_Intervalo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o 1º número:");
    int numero1 = scan.nextInt();

    System.out.println("Informe o 2º número:");
    int numero2 = scan.nextInt();

    System.out.println();

    if (numero1 < numero2) {
      for (int i = (numero1 + 1); i < numero2; i++)
        System.out.println(i);
    } else if (numero2 < numero1) {
      for (int i = (numero2 + 1); i < numero1; i++)
        System.out.println(i);
    }
  }
}
