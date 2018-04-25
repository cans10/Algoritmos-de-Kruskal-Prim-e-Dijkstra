package Tarefa5;

import java.util.Comparator;

/**
 *
 * @author Carlinhos
 */
public class Ordenar implements Comparator<Aresta> {

    @Override
    public int compare(Aresta a1, Aresta a2) {
        if (a1.getPeso() - a2.getPeso() > 0) {
            return 1;
        } else if (a1.getPeso() - a2.getPeso() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
