package com.mycompany.maratonajava;

public class Aula16Operadores02 {
  public static void main(String[] args){
        // (operadores) soma, subtração, divisão e multiplicação = - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double)numero02;
        System.out.println(resultado);
        
        //% resto
        int resto = 20 %2;
        System.out.println(resto);
        
        /* logicos irão retornar booleano < menor e maior > | <=menor igual ou maior igual >=
        == igual e diferente != esses são operadores logicos
        */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
    }
    
}
