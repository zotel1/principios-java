package com.principiante.java.clase15;

public class ForWhileDoWhile {
    public static void main(String args[]) {

        int i = 0;

        System.out.println("Serie con for: ");

        for (i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        i = 1;
        System.out.println("");
        System.out.println("Serie con while: ");
        while (i <= 10) {
            if (i < 10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
            i++;
        }
        i = 1;
        System.out.println("");
        System.out.println("Serie con Do-While");
        do {
            if (i < 10) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
            i++;
        } while (i <= 10);
    }
}
