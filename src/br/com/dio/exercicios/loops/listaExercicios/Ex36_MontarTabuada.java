package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Scanner;

/*
Desenvolva um programa que faça a tabuada de
um número qualquer inteiro que será digitado pelo
usuário, mas a tabuada não deve necessariamente
iniciar em 1 e terminar em 10, o valor inicial e
final devem ser informados também pelo usuário,
conforme exemplo abaixo:
Montar a tabuada de: 5
Começar por: 4
Terminar em: 7

Vou montar a tabuada de 5 começando em 4 e
terminando em 7:
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou
o final menor que o inicial.
 */

public class Ex36_MontarTabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Montar a tabuada de: ");
    int valor = scanner.nextInt();

    System.out.print("Começar por: ");
    int valorInicial = scanner.nextInt();

    System.out.print("Terminar em: ");
    int valorFinal = scanner.nextInt();

    while (valorFinal <= valorInicial) {
      System.out.println("O valor final deve ser maior que o inicial!");
      System.out.print("Terminar em: ");
      valorFinal = scanner.nextInt();
    }
    System.out.println();
    System.out.println(
        "Vou montar a tabuada de " + valor +
            " começando em " + valorInicial +
            " e terminando em " + valorFinal + ":");

    for (int i = valorInicial; i <= valorFinal; i++) {
      System.out.println(valor + " X " + i + " = " + (valor * i));
    }
  }
}