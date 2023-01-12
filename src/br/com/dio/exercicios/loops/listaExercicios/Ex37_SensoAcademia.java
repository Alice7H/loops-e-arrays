package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Uma academia deseja fazer um senso entre seus
clientes para descobrir o mais alto, o mais baixo,
a mais gordo e o mais magro, para isto você deve
fazer um programa que pergunte a cada um dos
clientes da academia seu código, sua altura e seu
peso. O final da digitação de dados deve ser dada
quando o usuário digitar 0 (zero) no campo código.
Ao encerrar o programa também deve ser informados os
códigos e valores do clente mais alto, do mais baixo,
do mais gordo e do mais magro, além da média das
alturas e dos pesos dos clientes.
 */

public class Ex37_SensoAcademia {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double alto = Integer.MIN_VALUE;
    double baixo = Integer.MAX_VALUE;
    double gordo = Integer.MIN_VALUE;
    double magro = Integer.MAX_VALUE;
    int codAlto = 1;
    int codBaixo = 1;
    int codGordo = 1;
    int codMagro = 1;

    double altura;
    double peso;
    int codigo = 1;
    double somaAltura = 0;
    double somaPeso = 0;
    int contador = 0;

    while (true) {
      System.out.print("Codigo: ");
      codigo = scanner.nextInt();

      if (codigo == 0) {
        break;
      }
      contador++;

      System.out.print("Altura: ");
      altura = scanner.nextDouble();
      somaAltura += altura;

      System.out.print("Peso: ");
      peso = scanner.nextDouble();
      somaPeso += peso;

      System.out.println();

      if (altura > alto) {
        alto = altura;
        codAlto = codigo;
      }
      if (altura < baixo) {
        baixo = altura;
        codBaixo = codigo;
      }
      if (peso < magro) {
        magro = peso;
        codMagro = codigo;
      }
      if (peso > gordo) {
        gordo = peso;
        codGordo = codigo;
      }
    }
    System.out.println();
    System.out.println("Cod. do mais alto: " + codAlto + " - " + alto);
    System.out.println("Cod. do mais baixo: " + codBaixo + " - " + baixo);
    System.out.println("Cod. do mais gordo: " + codGordo + " - " + gordo);
    System.out.println("Cod. do mais magro: " + codMagro + " - " + magro);
    System.out.println("Média das alturas: " + (somaAltura / contador));
    System.out.println("Média dos pesos: " + (somaPeso / contador));
    System.out.println();
  }
}
