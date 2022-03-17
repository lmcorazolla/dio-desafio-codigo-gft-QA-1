/*
Desafio

Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h
e a moto Y sai com velocidade constante de 90 Km/h.
Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X,
ou seja, consegue se afastar um quilômetro a cada 2 minutos.

O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos)
para a moto Y tomar essa distância da outra moto.
*/
package com.dio.desafiosQa1;

import java.io.IOException;
import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int km = leitor.nextInt();
        int minutos = (int) (( km ) / 0.5);                    //insira código no espaço em branco
        System.out.println(minutos + " minutos");
    }

}
