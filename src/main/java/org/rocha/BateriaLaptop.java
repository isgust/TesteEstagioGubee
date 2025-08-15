package org.rocha;
import java.util.List;


public class BateriaLaptop {

    private static final int cargaInicial = 50;

    public static int getBattery(List<Integer> eventos) {
        int bateriaAtual = cargaInicial;

        for (int evento : eventos) {
            // Se o evento for positivo, carrega a bateria
            if (evento <= 0) {
                bateriaAtual += evento; // evento já é negativo, então subtrai
            }
            // Se o evento for negativo, consome bateria
            else {
                bateriaAtual += evento;
            }


            // Garante que a bateria não ultrapasse 100%
            if (bateriaAtual > 100) {
                bateriaAtual = 100;
            }

            // Garante que a bateria não seja menor que 0%
            if (bateriaAtual < 0) {
                bateriaAtual = 0;
            }
        }

        return bateriaAtual;
    }

    // MétodoMain
    public static void main(String[] args) {
        // Exemplo de entrada conforme o problema
        List<Integer> eventosDoExemplo = List.of(10, -20, 61, -15);

        // Chama a função getBattery com a lista de eventos
        int resultadoFinal = getBattery(eventosDoExemplo);

        // Imprime o resultado
        System.out.println("Carga final da bateria: " + resultadoFinal);

    }
}