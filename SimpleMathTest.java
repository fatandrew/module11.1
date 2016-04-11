import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by User on 07.04.2016.
 */
public class SimpleMathTest {
    private static SimpleMath simpleMath;

    @BeforeClass
    public static void setUpClass() throws Exception {
        simpleMath = new SimpleMath();
    }

    @Test(timeout = 4000)
    public void testAreaOfTriangle() throws Exception {
        int base = 2;
        int height = -1;
        int radius = 2;
        int c=2;
        final int result = simpleMath.multdiv(base, height, c);

        Assert.assertEquals(base * height / c, result);
    }

    @Test
    public void testAreaOfRectangle() throws Exception{
        int base = 2;
        int height = -1;
        final int result = simpleMath.mult(base, height);
        Assert.assertEquals(base*height, result);
    }
}