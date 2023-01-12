package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia e valide as seguintes informações:
 * Nome: maior que 3 caracteres;
 * Idade: entre 0 e 150;
 * Salário: maior que zero;
 * Sexo: 'f' ou 'm';
 * Estado Civil: 's', 'c', 'v', 'd';
*/

public class Ex3_Usuario {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome;
    int idade;
    float salario;
    String genero;
    String estadoCivil;

    do {
      System.out.println("Informe o nome:");
      nome = scan.next();
    } while (nome.length() < 3);

    do {
      System.out.println("Informe a idade:");
      idade = scan.nextInt();
    } while (idade < 0 && idade > 150);

    do {
      System.out.println("Informe o salário:");
      salario = scan.nextFloat();
    } while (salario < 0);

    do {
      System.out.println("Informe o gênero: ");
      genero = scan.next();
    } while (!genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("m"));

    do {
      System.out.println("Informe o estado civil:");
      estadoCivil = scan.next();
    } while (!estadoCivil.equalsIgnoreCase("s") &&
        !estadoCivil.equalsIgnoreCase("c") &&
        !estadoCivil.equalsIgnoreCase("v") &&
        !estadoCivil.equalsIgnoreCase("d"));
  }
}
