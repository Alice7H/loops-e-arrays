package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia um nome de usuário e a sua senha
 * e não aceite a senha igual ao nome do usuário,
 * mostrando uma mensagem de erro
 * e voltando a pedir as informações.
 */

public class Ex2_NomeSenha {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome;
    String senha;
    boolean validInput = false;

    do {
      System.out.println("Informe o nome: ");
      nome = scan.next();
      System.out.println("Informe a senha: ");
      senha = scan.next();

      if (nome.equalsIgnoreCase(senha)) {
        System.out.println("Senha inválida! Tente novamente.");
      } else {
        validInput = true;
      }
    } while (!validInput);

  }
}
