package com.karen.taller4;

import java.util.Scanner;
public class factura extends supermercado {
    public usuario usuario;
    public producto Producto;

    public factura() {
    }
    public void menuFactura(){
        Scanner sc = new Scanner(System.in);
        OpcionComprar = sc.nextLine();
        comprar(OpcionComprar);
    }

    protected void comprar(String cantidad) {
        int c = Integer.parseInt(cantidad) - 1;

    }
}

