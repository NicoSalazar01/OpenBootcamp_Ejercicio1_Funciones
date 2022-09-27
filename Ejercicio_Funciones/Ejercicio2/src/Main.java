import java.nio.channels.ClosedChannelException;

// EJERCICIO 2

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puertas);

    }
}
class Coche {
    public int puertas = 3;
    public void SumarPuerta() {
        this.puertas++;
    }
}