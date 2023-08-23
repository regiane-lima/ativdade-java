import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// A classe principal onde tudo começa, cheia de energia neko! 🌟💫
public class GatinhoLaranja {
    public static void main(String[] args) {
        try {
            // Criamos uma instância do nosso gatinho laranja especial chamada "neko"! 🐾🍊
            BufferedWriter g = new BufferedWriter(new FileWriter("mensagem.txt"));

            // O gatinho começa a escrever mensagens fofas e cheias de amor 💖✉️
            g.write("Querido amigo,\n");
            g.write("Espero que seu dia seja tão brilhante quanto meu pelo laranja!\n");
            g.write("Miaus carinhosos,\n");
            g.write("Gatinho Laranja 🐾");

            // Hora de guardar as mensagens no caderninho e deixar tudo organizadinho! 📔💤
            g.flush(); // Aqui você deve usar g.flush() para guardar as mensagens no arquivo.
            g.close();

        } catch (IOException e) {
            e.printStackTrace();  // Se algo der errado, o gatinho mostra a patinha e pede ajuda 🐾❌
        }
    }
}
