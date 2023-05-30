package exercicio4;

/**
 *
 * @author aluno
 */
public class Circulo implements Redimensionavel {
    @Override
    public void redimensionar(double fator){
        System.out.println("Redimensionando.....\n O raio do circulo pelo fator foi "+ fator);
    }
}
