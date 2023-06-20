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
public class SituacaoChuva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);//le o que o usuario digitou e guarda em uma variavel.
            System.out.println("está chovendo? Responda com S/N");// manda uma mensagem ao usuario para imputar se está chovendo ou não
            String resposta = scanner.next();
            
            if("S".equals(resposta)){
                System.out.println("Você disse que está chovendo");
            }else{
                System.out.println("Você disse que não está chovendo");
            }
    }
    
}
