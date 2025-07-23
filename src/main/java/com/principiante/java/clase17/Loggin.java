package com.principiante.java.clase17;
import java.util.Scanner;

// Este ejercicio es la continuacion de la clase 17

public class Loggin {
    public static void main(String args[]){

        String usuario = "", pasword = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario");
        usuario = entrada.nextLine();

        System.out.println("Ingresa tu contraseña: ");
        pasword = entrada.nextLine();

        if (usuario.equals("cristian") && pasword.equals("123456")){
            System.out.println("Inicio de sesion correcto!");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}
