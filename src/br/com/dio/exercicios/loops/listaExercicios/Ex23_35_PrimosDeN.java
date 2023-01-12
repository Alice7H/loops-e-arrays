package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que mostre todos os primos
 * entre 1 e N sendo N um número inteiro fornecido
 * pelo usuário.
 * O programa deverá mostrar também o número de
 * divisões que ele executou para encontrar os
 * números primos.
 * Serão avaliados o funcionamento, o estilo e o
 * número de testes (divisões) executados.
 */

/*
 * Encontrar números primos é uma tarefa difícil.
 * Faça um programa que gera uma lista dos números
 * primos existentes entre 1 e um número inteiro
 * informado pelo usuário.
 */

public class Ex23_35_PrimosDeN {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Números primos de 1 até quanto? ");
    int valorLimite = scan.nextInt();
    int contadorDeDivisoes = 0;

    for (int i = 2; i <= valorLimite; i++) {
      int contador = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          contador++;
        }
        contadorDeDivisoes++;
      }
      if (contador == 2)
        System.out.print(i + " ");
    }
    System.out.println();
    System.out.println(contadorDeDivisoes);
  }
}
