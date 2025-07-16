package com.principiante.java.clase15;

public class CiclosDos {
    public static void main(String args[]){

        int i = 1, j = 99;
        System.out.println("Serie con for: ");
        for(i = 1; i <= 5; i++){
            if(i < 5){
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.println(j);
            }
            j--;
        }
    }
}
