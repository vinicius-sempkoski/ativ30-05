package exercicio3;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Armazenavel carreg = new ArquivoCache();
        Armazenavel salv = new ArquivoCache();
        
        carreg.carregar();
        salv.salvar();
    }
    
}
