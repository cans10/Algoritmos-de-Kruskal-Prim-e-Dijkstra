package Tarefa5;

import java.util.ArrayList;

/**
 *
 * @author Carlinhos
 */
public class Tarefa5Test {

    /**
     * @param args the command line arguments
     */
    private static int qtdeVertice;
    private static int[] entrada;

    public static void main(String[] args) {
        String end = "src/Tarefa5/dij50.txt";

        obterDados(end);

        int origem = 0;
        int destino = qtdeVertice - 1;

        System.out.println("\n========================= KRUSKAL ==============================\n");
        Algoritmo_Kruskal kruskal = new Algoritmo_Kruskal(qtdeVertice, entrada);

        System.out.println("ARVORE ESPALHADA KRUSKAL\n" + kruskal.getArvoreEspalhada());
        System.out.println("TOTAL PESOS KRUSKAL = " + kruskal.getPesoArvore());

        System.out.println("\n========================== PRIM ================================\n");
        Algoritmo_Prim prim;
        try {
            prim = new Algoritmo_Prim(qtdeVertice, entrada, origem);
            System.out.println("ARVORE ESPALHADA PRIM\n" + prim.getArvoreEspalhada());
            System.out.println("TOTAL PESOS PRIM = " + prim.getPesoArvore());
        } catch (VerticeInexistenteException ex) {
            ex.toString();
        }

        System.out.println("\n======================== DIJKSTRA ==============================\n");
        Algoritmo_Dijkstra dijkstra;
        try {
            dijkstra = new Algoritmo_Dijkstra(qtdeVertice, entrada, origem, destino);
            System.out.println("CAMINHO MÍNIMO DE " + origem + " para " + destino
                    + ":\n" + dijkstra.getCaminho());

            System.out.println("PESO TOTAL = " + dijkstra.getPesoCaminho());

            System.out.println("\nPESO DO CAMINHO MÍNIMO PARA TODOS OS VÉRTICES A PARTIR DO "
                    + "V" + origem + ":\n" + dijkstra.getCaminhoTodos());
        } catch (VerticeInexistenteException ex) {
        }
    }

    private static void obterDados(String end) {
        LerDados ler = new LerDados(end);
        ArrayList<Integer> dados = ler.lerArquivo();

        qtdeVertice = dados.get(0);
        entrada = new int[dados.size() - 1];

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = dados.get(i + 1);
        }
    }
}
