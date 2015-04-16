/*
 * this class is used to encrypt the password when it goes to the file and to decrypt
 * the password when it is read in.
 */

/**
 *
 * @author James
 */
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
public class AESCrypt {
    /**
     * Encrypts the input string.
     * @param value
     * @return
     * @throws Exception 
     */
    public static String encrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(AESCrypt.ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
        String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
        return encryptedValue64;
               
    }
    /**
     * Decrypts the input.
     * @param value
     * @return
     * @throws Exception 
     */
    public static String decrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(AESCrypt.ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte [] decryptedValue64 = new BASE64Decoder().decodeBuffer(value);
        byte [] decryptedByteValue = cipher.doFinal(decryptedValue64);
        String decryptedValue = new String(decryptedByteValue,"utf-8");
        return decryptedValue;
                
    }
    
    private static Key generateKey() throws Exception 
    {
        Key key = new SecretKeySpec(AESCrypt.KEY.getBytes(),AESCrypt.ALGORITHM);
        return key;
    }

    
    
    
    
    
    
    
    
    
    private static final String KEY = "1Hbfh667adfDEJ78";
    private static final String ALGORITHM = "AES";


}// end Main
