package com.principiante.java.clase14;

public class CicloDoWhile {

    public static void main(String args[]) {

        int i = 1000;
        do{
            System.out.println(i + ", El programa solo se detiene cuando i es igual o mayor a cero");
            i-=200;
        }while(i >= 0);

    }
}
