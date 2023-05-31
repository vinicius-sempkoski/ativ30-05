package exercicio7;

/**
 *
 * @author aluno
 */
public class PesquisaBancoDados implements Pesquisavel{
    String[] bancoDados = {"Vinicius", "Brutus", "Fernanda", "Carlos"};
    
    @Override
    public void pesquisar(String palavraChave){
        for(int i = 0; i < bancoDados.length; i++){
            if(palavraChave == bancoDados[i]){
                System.out.println("Palavra encontrada pos: " + i);
                break;
            }
        }
    }
}
