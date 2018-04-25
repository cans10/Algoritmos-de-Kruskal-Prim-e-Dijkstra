package Tarefa5;

/**
 *
 * @author Carlinhos
 */
public class VerticeInexistenteException extends Exception {

    private String erro;

    public VerticeInexistenteException(String erro) {
        super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }
}
