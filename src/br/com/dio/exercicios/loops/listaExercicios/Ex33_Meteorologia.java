package br.com.dio.exercicios.loops.listaExercicios;
/*
 * O Departamento Estadual de Meteorologia lhe
 * contratou para desenvolver um programa que
 * leia as um conjunto indeterminado de
 * temperaturas, e informe ao final a menor e a
 * maior temperaturas informadas, bem como a média
 * das temperaturas.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex33_Meteorologia {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    boolean continuarInput = true;
    double media = 0;
    double soma = 0;
    int contador = 0;
    double menor = Double.MAX_VALUE;
    double maior = Double.MIN_VALUE;

    do {
      System.out.println("Informe a temperatura:");
      double temperatura = scanner.nextDouble();

      if (temperatura > maior) {
        maior = temperatura;
      }
      if (temperatura < menor) {
        menor = temperatura;
      }
      soma += temperatura;
      contador++;
      System.out.println("Deseja continuar? [s/n]");
      String resultado = scanner.next();

      if (resultado.equalsIgnoreCase("n"))
        continuarInput = false;

    } while (continuarInput);

    media = soma / contador;
    System.out.println("Média: " + media);
    System.out.println("Maior:" + maior);
    System.out.println("Menor: " + menor);
  }
}
