package com.mycompany.maratonajava;

 public class Aula12TiposPrimitivos03 {
    public static void main(String[] args) {
        //int, double, float, char, byte, long, boolean 
        int idade = (int)10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000;
        double salarioFloat = 2500.0;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
                
        System.out.println("A idade é " + idade + " anos"); 
        System.out.println(falso); 
        System.out.println("char " + caractere); 
        System.out.println(numeroGrande); 
        
    }
}