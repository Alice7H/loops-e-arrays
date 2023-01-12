package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Altere o programa de cálculo do fatorial,
 * permitindo ao usuário calcular o fatorial
 * várias vezes e limitando o fatorial a números
 * inteiros positivos e menores que 16.
 */
public class Ex20_FatorialAlterado {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean continuarInput = false;

    do {
      System.out.println("Fatorial: ");
      int fatorial = scan.nextInt();

      while (fatorial < 0 || fatorial > 16) {
        System.out.println("Fatorial inválido");
        System.out.println("Informe fatorial novamente: ");
        fatorial = scan.nextInt();
      }

      int multiplicacao = 1;

      System.out.print(fatorial + "! = ");
      for (int i = fatorial; i >= 1; i--) {
        multiplicacao = multiplicacao * i;
      }

      System.out.println(multiplicacao);

      System.out.println("Deseja continuar? [S/N]");
      String resultado = scan.next();
      if (resultado.equalsIgnoreCase("n")) {
        continuarInput = true;
      }
    } while (!continuarInput);
  }
}
