package exercicio3;

/**
 *
 * @author aluno
 */
public class ArquivoCache implements Armazenavel{

    @Override
    public void salvar() {
        System.out.println("Salvando dados...");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando dados...");
    }
}
