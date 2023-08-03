package com.mycompany.pizza;
public class ClassPizza {

    private int quantidadeDePedaços = 8;
    private String sabor;

    public void setquantidadeDePedaços() {
        this.quantidadeDePedaços = quantidadeDePedaços;
    }

    public int getquantidadeDePedaços() {
        return this.quantidadeDePedaços;
    }

   
    public void RetiraPedaço() {

        if (quantidadeDePedaços > 0) {
            System.out.println("estou comendo pizza!!");
            quantidadeDePedaços--;
               System.out.println("pedaço retirado restam "+quantidadeDePedaços);
        } else {
            System.out.println("não há mais pedaços de pizza!!!!"); 
        }

    }
}
