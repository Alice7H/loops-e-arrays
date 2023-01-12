package br.com.dio.exercicios.loops.listaExercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * O Sr. Manoel Joaquim expandiu seus negócios para além
 * dos negócios de 1,99 e agora possui uma loja de
 * conveniências. Faça um programa que implemente uma caixa
 * registradora rudimentar.
 * O programa deverá receber um número desconhecido de
 * valores referentes aos preços das mercadorias. Um valor
 * zero deve ser informado pelo operador para indicar o
 * final da compra. O programa deve então mostrar o total
 * da compra e perguntar o valor em dinheiro que o cliente
 * forneceu, para então calcular e mostrar o valor do troco.
 * Após esta operação, o programa deverá voltar ao ponto
 * inicial, para registrar a próxima compra. A saída deve
 * ser conforme o exemplo abaixo:
    Lojas Tabajara
    Produto 1: R$ 2.20
    Produto 2: R$ 5.80
    Produto 3: R$ 0
    Total: R$ 8.00
    Dinheiro: R$ 20.00
    Troco: R$ 12.00
    ...
 */
public class Ex31_LojasTabajara {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int contador = 0;
      double total = 0;
      boolean continuarCompra = true;
      System.out.println("Lojas Tabajara");

      do {
        contador++;
        System.out.print("Produto " + contador + ": R$ ");
        double valor = scanner.nextDouble();
        total += valor;

        if (valor == 0) {
          continuarCompra = false;
        }
      } while (continuarCompra);

      System.out.println("Total: R$ " + String.format("%.2f", total));
      System.out.print("Dinheiro: R$ ");
      double dinheiro = scanner.nextDouble();
      System.out.println("Troco: R$ " + String.format("%.2f", (dinheiro - total)));
      System.out.println();
    }
  }
}
