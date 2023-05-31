package exercicio6;

/**
 *
 * @author aluno
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Criptografavel cript = new AESCryptografia();
        
        byte[] textoCriptografado = cript.criptografar("Vinicius Sempkoski");
        System.out.println("Texto Criptografado: " + textoCriptografado);
        System.out.println("Text Descriptografado: " + cript.descriptrografar(textoCriptografado));
    }
    
}
