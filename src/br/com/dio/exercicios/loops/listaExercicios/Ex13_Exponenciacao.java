package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça dois números, base e expoente,
 * calcule e mostre o primeiro número elevado ao segundo número.
 * Não utilize a função de potência da linguagem.
 */

public class Ex13_Exponenciacao {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o número base:");
    int base = scan.nextInt();

    System.out.println("Informe o número expoente:");
    int expoente = scan.nextInt();

    int resultado = 1;

    for (int i = 1; i <= expoente; i++) {
      resultado *= base;
    }

    System.out.println("Resultado: " + resultado);

  }
}
