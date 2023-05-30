package exercicio1;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel triangulo = new Triangulo();
        Desenhavel retangulo = new Retangulo();
        
        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
        
    }
    
}
