/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
/**
 *
 * @author senai
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//le o que o usuario digitou e guarda em uma variavel.
            System.out.println("Digite seu peso em kg:(ex: 100,20)");// manda uma mensagem ao usuario para imputar o peso
                double peso = scanner.nextDouble();
            System.out.println("Digite sua altura em metros :(ex: 1,70)");// manda uma mensagema ao usuario para imputar a altura
                double altura = scanner.nextDouble();
       
                double imc=peso/(altura*altura);
                System.out.println(imc);
                
            if(imc< 18.5){   //ESTE IF VERIFICA QUEM ESTA ABAIXO DO PESO
                System.out.println("Você está abaixo do peso");
            }else if(imc >= 18.5 && imc <= 24.9){    //ESTE IF VERIFICA QUEM ESTA ABAIXO DO PESO
                System.out.println("Você está no peso correto");
            }else if(imc >= 25 && imc <= 29.9){      //ESTE IF VERIFICA QUEM ESTA NO PESO CORRETO
                System.out.println("Você está acima do peso");
            }else if(imc >= 30 && imc <= 34.9){      //ESTE IF VERIFICA QUEM ESTA ACIMA DO PESO
                System.out.println("Você está obeso grau 1, cuidado");
            }else if(imc >= 35 && imc <= 39.9){      //ESTE IF VERIFICA QUEM ESTA OBESO GRAU 1 
                System.out.println("Você está obeso grau 2, corra.");
            }else{                                   //ESTE IF VERIFICA QUEM ESTA OBESO GRAU 2
                System.out.println("Você está obeso morbido.");   //ESTE IF VERIFICA QUEM ESTA OBESO MÓRBIDO
            }
    }
    
}
