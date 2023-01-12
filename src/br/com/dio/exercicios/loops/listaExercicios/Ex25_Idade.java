package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que peça para n pessoas
 * a sua idade, ao final o programa devera
 * verificar se a média de idade da turma varia
 * entre 0 e 25, 26 e 60 e maior que 60;
 * e então, dizer se a turma é jovem, adulta ou
 * idosa, conforme a média calculada.
 */

public class Ex25_Idade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean continuarInput = true;
    double media = 0;
    double soma = 0;
    double quantidade = 0;
    String estado = null;

    do {
      System.out.println("Informe sua idade: ");
      int idade = scan.nextInt();

      while (idade < 0) {
        System.out.println("Idade inválida!");
        System.out.println("Informe novamente: ");
        idade = scan.nextInt();
      }

      quantidade++;
      soma += idade;
      media = soma / quantidade;

      System.out.println("Deseja continuar no programa? [s/n]");
      String resultado = scan.next();

      if (resultado.equalsIgnoreCase("n")) {
        continuarInput = false;
      }
    } while (continuarInput);

    if (media > 0 && media <= 25) {
      estado = "Jovem";
    } else if (media <= 60) {
      estado = "Adulta";
    } else {
      estado = "Idosa";
    }

    System.out.println("Média de idade: " + media);
    System.out.println("Turma " + estado);
  }
}
