package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * A série de Fibonacci é formada pela seqüência
 * 1,1,2,3,5,8,13,21,34,55,...
 * Faça um programa capaz de gerar a série até o
 * n−ésimo termo.
*/
public class Ex15_Fibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o n-ésimo termo: ");
    int valor = scan.nextInt();

    int primeiro = 1;
    int segundo = 1;
    int proximo;

    System.out.println();
    System.out.print(primeiro + " ");
    System.out.print(segundo + " ");

    for (int i = 3; i < valor; i++) {
      proximo = primeiro + segundo;
      primeiro = segundo;
      segundo = proximo;
      System.out.print(proximo + " ");
    }
  }
}
