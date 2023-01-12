package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Altere o programa anterior para que ele aceite
 * apenas números entre 0 e 1000.
 */

public class Ex19_MaiorMenorSoma2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos números? ");
    int quantidade = scan.nextInt();
    System.out.println();

    int menor = Integer.MAX_VALUE;
    int maior = Integer.MIN_VALUE;
    int soma = 0;

    for (int i = 1; i <= quantidade; i++) {
      System.out.println("Informe o " + i + "º número: ");
      int numero = scan.nextInt();

      while (numero < 0 || numero > 1000) {
        System.out.println("Número inválido");
        System.out.println("Informe o " + i + "º número: ");
        numero = scan.nextInt();
      }
      soma += numero;

      if (numero > maior) {
        maior = numero;
      }
      if (numero < menor) {
        menor = numero;
      }
    }

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Soma: " + soma);
  }
}
