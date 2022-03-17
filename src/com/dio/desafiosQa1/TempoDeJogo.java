package com.dio.desafiosQa1;
/*
Desafio

Tento como base a hora inicial e final de um jogo, calcule a duração do dele,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de,
 60 minutos e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
*/

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args){

        //complete os espaços em branco com sua solução para o problema

        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        horas = fim-inicio;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }if(horas < 0 ){
            System.out.print("O JOGO DUROU " + (24 + horas) + " HORA(S)\n");
        }if(horas > 0 ){
            System.out.print("O JOGO DUROU " + (horas) + " HORA(S)\n");
        }
    }
}

