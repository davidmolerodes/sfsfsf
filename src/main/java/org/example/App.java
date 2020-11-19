package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner tec = new Scanner(System.in);
        libros nuevo = new libros();

        System.out.println("TITULO:");
        nuevo.setTitulo(tec.nextLine());

        System.out.println(nuevo.getTitulo());
    }
}
