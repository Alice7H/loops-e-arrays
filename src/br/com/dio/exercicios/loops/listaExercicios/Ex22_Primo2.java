package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Altere o programa de cálculo dos números primos,
 * informando, caso o número não seja primo,
 * por quais número ele é divisível.
 */

public class Ex22_Primo2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um valor:");
    int numero = scan.nextInt();

    boolean primo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        System.out.println("Divisível por " + i);
        primo = false;
      }
    }

    if (primo)
      System.out.println(numero + " é primo");
  }
}
