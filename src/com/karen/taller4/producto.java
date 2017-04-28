package com.karen.taller4;

import java.util.Scanner;

public class producto extends supermercado {
    public String azucar;
    public String leche;
    public String lenteja;
    public String arroz;
    public int[] valor = {1000, 2000, 1500, 3000};

    public producto() {
        int[] cantidad = new int[]{1, 2, 3, 4};
        menuProducto();
    }

    public void menuProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informacion del producto\n" +
                "*********************************" +
                "Producto:           Valor:" +
                "1)Azucar:" + azucar + "$1000" + valor +
                "2)Leche:" + leche + "$2000" + valor +
                "3)Lenteja:" + lenteja + "$1500" + valor +
                "4)Arroz:" + arroz + "$3000" + valor +
                "*********************************");

        menuProducto();
    }

}



