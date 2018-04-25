package Tarefa5;

/**
 *
 * @author Carlinhos
 */
public class Adjacente {

    private final Vertice vertice;
    private final int peso;

    public Adjacente(Vertice v, int p) {
        this.vertice = v;
        this.peso = p;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public int getPeso() {
        return peso;
    }

}
