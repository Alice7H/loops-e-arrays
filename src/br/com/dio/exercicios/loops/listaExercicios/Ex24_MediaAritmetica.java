package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que calcule o mostre a média
 * aritmética de N notas.
 */
public class Ex24_MediaAritmetica {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean continuarComPrograma = true;
    double media = 0;
    int contador = 0;
    double soma = 0;

    do {
      System.out.println("Informe a nota: ");
      double nota = scan.nextDouble();
      contador++;
      soma += nota;
      media = soma / contador;

      System.out.println("Deseja continuar com o programa? [S/N]");
      String resultado = scan.next();

      if (resultado.equalsIgnoreCase("n")) {
        continuarComPrograma = false;
      }
    } while (continuarComPrograma);

    System.out.println("Média: " + media);
  }
}
