package com.mycompany.gatinhosfofos.GatinhosFofos;

import java.io.FileWriter;
import java.io.IOException;

public class GatinhosFofos {

    public static void main(String[] args) {
        // Nome do arquivo que vamos criar
        String nomeArquivo = "gatinhos.txt";

        // Dados dos gatinhos fofos
        String[] gatinhos = {
            "Nome: Whiskers, Idade: 2 anos, Cor: Cinza",
            "Nome: Mia, Idade: 1 ano, Cor: Branco e Marrom",
            "Nome: Luna, Idade: 3 anos, Cor: Preto"
        };

        // Tentando escrever no arquivo usando FileWriter
        try {
            FileWriter writer = new FileWriter(nomeArquivo);

            for (String gatinho : gatinhos) {
                writer.write(gatinho + "\n"); // Adiciona um gatinho por linha
            }

            writer.close(); // Fechando o FileWriter

            System.out.println("Dados dos gatinhos foram escritos no arquivo com sucesso!");

           try {
                ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", nomeArquivo);
                processBuilder.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
