import static org.junit.Assert.*;
import org.junit.*;
public class GiveValidMail {
  private static Cut sje;
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    sje = new Cut();
  }
  @Test
  public void testGiveValidMail() {
    assertTrue("Entspricnht nicht einer validen Mailadresse:",(sje.GiveValidMail("test@test.de")).equals("test@test.de"));
  }
}