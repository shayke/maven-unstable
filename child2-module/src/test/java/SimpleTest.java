import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Shay Yaakov
 */
@Test
public class SimpleTest {

    public void fail() throws Exception {
        Assert.fail();
    }
}
