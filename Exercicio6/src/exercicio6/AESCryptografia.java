package exercicio6;

/**
 *
 * @author aluno
 */
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESCryptografia implements Criptografavel {
    @Override
    public byte[] criptografar(String dados) {
        String chaveencriptacao = "0123456789abcdef";
        String IV = "AAAAAAAAAAAAAAAA";
        
        Cipher encripta = null;
        try {
            encripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        SecretKeySpec key = null;
        try {
            key = new SecretKeySpec(chaveencriptacao.getBytes("UTF-8"), "AES");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            encripta.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAlgorithmParameterException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return encripta.doFinal(dados.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String descriptrografar(byte[] dadosCriptografados) {
        String chaveencriptacao = "0123456789abcdef";
        String IV = "AAAAAAAAAAAAAAAA";
        
        Cipher decripta = null;
        try {
            decripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        SecretKeySpec key = null;
        try {
            key = new SecretKeySpec(chaveencriptacao.getBytes("UTF-8"), "AES");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            decripta.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAlgorithmParameterException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return new String(decripta.doFinal(dadosCriptografados),"UTF-8");
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
