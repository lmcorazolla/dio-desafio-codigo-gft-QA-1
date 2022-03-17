/*

Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse
um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N
que indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros
A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor,*/
package com.dio.desafiosQa1;

import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count, A, B = 0;

        do {
            count = scan.nextInt();
        } while (count <= 0);

        for (int i = 0; i < count; i++) {

            A = scan.nextInt();
            B = scan.nextInt();
            String AA = A + "";
            String BB = B + "";
            boolean b1 = AA.endsWith(BB);

            if (b1==true) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }

    }
}
