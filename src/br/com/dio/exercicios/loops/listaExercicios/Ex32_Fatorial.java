package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:
 * Fatorial de: 5
 * 5! =  5 . 4 . 3 . 2 . 1 = 120
 */

public class Ex32_Fatorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Fatorial de: ");
    int valor = scanner.nextInt();

    int resultado = 1;

    System.out.print(valor + "! = ");
    for (int i = valor; i > 0; i--) {
      resultado *= i;
      if (i != 1) {
        System.out.print(i + " . ");
      } else {
        System.out.println(i + " = " + resultado);
      }
    }
  }
}
