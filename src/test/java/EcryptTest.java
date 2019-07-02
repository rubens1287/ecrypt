import org.junit.Assert;
import org.junit.Test;

public class EcryptTest {

    @Test
    public void testDecryptPass(){
         Assert.assertEquals(Ecrypt.decryptXOR("Q0dRUV9B","1234"),"rubens");
    }

    @Test
    public void testEcryptPass(){
        Assert.assertTrue(Ecrypt.encryptXOR("Rubens","1234").contains("Y0dRUV9B"));
    }
}
