package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça um número inteiro e
 * determine se ele é ou não um número primo.
 * Um número primo é aquele que é divisível
 * somente por ele mesmo e por 1.
 */

/*
 * Os números primos possuem várias aplicações
 * dentro da Computação, por exemplo na Criptografia.
 * Um número primo é aquele que é divisível apenas
 * por um e por ele mesmo.
 * Faça um programa que peça um número inteiro e
 * determine se ele é ou não um número primo.
*/

public class Ex21_34_Primo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um valor:");
    int numero = scan.nextInt();
    boolean primo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        System.out.println(numero + " não é primo");
        primo = false;
        break;
      }
    }
    if (primo)
      System.out.println(numero + " é primo");
  }
}
