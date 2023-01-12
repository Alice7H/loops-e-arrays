package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que calcule o número médio
 * de alunos por turma.
 * Para isto, peça a quantidade de turmas e a
 * quantidade de alunos para cada turma.
 * As turmas não podem ter mais de 40 alunos.
 */

public class Ex27_MediaAlunoTurma {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantidade de turmas:");
    int quantidadeDeTurma = scan.nextInt();

    double soma = 0;
    int alunoPorTurma;

    for (int i = 0; i < quantidadeDeTurma; i++) {
      System.out.println("Quantidade de alunos por turma:");
      alunoPorTurma = scan.nextInt();

      while (alunoPorTurma > 40) {
        System.out.println("Quantidade de alunos excedido");
        System.out.println("Informe novamente: ");
        alunoPorTurma = scan.nextInt();
      }
      soma += alunoPorTurma;
    }
    double media = soma / quantidadeDeTurma;
    System.out.println("Média de alunos por turma: " + media);
  }
}
