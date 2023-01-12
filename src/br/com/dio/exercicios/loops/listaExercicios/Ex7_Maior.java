package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e informe o maior número.
 */
public class Ex7_Maior {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int contador = 0;
    int maior = Integer.MIN_VALUE;
    int numero = 0;

    while (contador < 5) {
      System.out.println("Informe um número:");
      numero = scan.nextInt();

      if (numero > maior) {
        maior = numero;
      }
      contador++;
    }

    System.out.println("Maior número:" + maior);
  }
}
