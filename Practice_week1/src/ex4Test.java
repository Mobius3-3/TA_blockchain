import org.junit.Assert;
import java.util.Arrays;

public class ex4Test {
    @org.junit.Test
    public void calculateTest1() throws Exception {
        Assert.assertEquals(ex4.findTopk(new int[]{-1, 15, 59, 22, 6, 42, 45, 0},4), Arrays.asList(59,45,42,22));
    }

    @org.junit.Test
    public void calculateTest2() throws Exception {
        Assert.assertEquals(ex4.findTopk(new int[]{5, 10, 22, 100, 8}, 2),  Arrays.asList(100,22));
    }

}