package com.karen.taller4;

import java.util.Scanner;

public class supermercado{
    protected String usuario;
    private String [] producto = new String[4];
    public static int Producto;
    protected String factura;
    protected String OpcionComprar;

    public supermercado() {
    }

    public void menuSupermercado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBIENVENIDO AL SUPERMERCADO\n");
        System.out.println("\nELIJA EL PRODUCTO A COMPRAR\n" );
        for (int i=0;i<=5; i++) {
            switch (Producto) {
                case 0:
                    if (Producto != 1) {
                        producto[i] = "1) Azucar";
                    } else {
                        producto[i] = "1) Agotado";
                    }
                    break;
                case 1:
                    if (Producto != 2){
                        producto[i] = "2)Leche";
                    }else {
                        producto[i] = "2) Agotado";
                    }
                    break;
                case 2:
                    if (Producto != 3) {
                        producto[i] = "3)Lenteja";
                    }else {
                        producto[i] = "3) Agotado";
                    }
                    break;
                case 3:
                    if (Producto !=4){
                        producto[i] = "4)Arroz";
                    }else {
                        producto[i] = "4) Agotado";
                    }
                    break;
            }
            System.out.println(producto[i]+"\n");
        }
        System.out.println("\n");
        OpcionComprar = sc.nextLine();
        menuSupermercado();

    }
}


