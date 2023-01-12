package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
  * Altere o programa anterior para mostrar no final a soma dos números.
*/
public class Ex11_IntervaloSoma {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int soma = 0;

    System.out.println("Informe o 1º número:");
    int numero1 = scan.nextInt();

    System.out.println("Informe o 2º número:");
    int numero2 = scan.nextInt();

    System.out.println();

    if (numero1 < numero2) {
      for (int i = (numero1 + 1); i < numero2; i++)
        soma += i;
    } else if (numero2 < numero1) {
      for (int i = (numero2 + 1); i < numero1; i++)
        soma += i;
    }
    System.out.println("Soma do intervalo: " + soma);
  }
}
