/*
Desafio

Leia dois valores inteiros identificados como variáveis A e B.
Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.
*/
package com.dio.desafiosQa1;

import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = (A + B)     ;  //insira as variáveis corretamente

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}
