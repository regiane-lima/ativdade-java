package com.mycompany.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class classToga {
    public static void main(String[] args) {
        try {
            // Criamos um BufferedWriter associado a um FileWriter para o arquivo "output.txt"
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // Escrevemos uma linha no arquivo usando o BufferedWriter
            writer.write("Olá, mundo!");

            // Lembramos o BufferedWriter de esvaziar o buffer e realmente escrever os dados no arquivo
            writer.flush();

            // Fechamos o BufferedWriter e liberamos recursos
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
