package calculo;

public class ventilador {

    double velocidade = 0;
    int numeroDePas = 3;

    public void girar(double valor) {
        velocidade = valor;
    }

    public void mostrarVelocidade() {
        System.out.println("a velocidade é" + velocidade);
    }

}
