package br.com.dio.exercicios.loops.listaExercicios;

/*
 * A série de Fibonacci é formada pela seqüência
 * 0,1,1,2,3,5,8,13,21,34,55,...
 * Faça um programa que gere a série
 * até que o valor seja maior que 500
 */

public class Ex16_Fibonacci2 {
  public static void main(String[] args) {

    int primeiro = 0;
    int segundo = 1;
    int proximo = 0;

    System.out.println();
    System.out.print(primeiro + " ");
    System.out.print(segundo + " ");

    while (proximo < 500) {
      proximo = primeiro + segundo;
      primeiro = segundo;
      segundo = proximo;

      System.out.print(proximo + " ");
    }

  }
}
