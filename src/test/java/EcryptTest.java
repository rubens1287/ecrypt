import org.junit.Assert;
import org.junit.Test;

public class EcryptTest {

    @Test
    public void testDecryptPass(){
         Assert.assertEquals(Encrypt.decryptXOR("Q0dRUV9B","1234"),"rubens");
    }

    @Test
    public void testEncryptPass(){
        Assert.assertTrue(Encrypt.encryptXOR("Rubens","1234").contains("Y0dRUV9B"));
    }
}
