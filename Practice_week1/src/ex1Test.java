import org.junit.Assert;


public class ex1Test {
    @org.junit.Test
    public void calculateTest1() throws Exception {
        Assert.assertEquals(ex1.findDuplicate("abcabc"), 3);
    }

    @org.junit.Test
    public void calculateTest2() throws Exception {
        Assert.assertEquals(ex1.findDuplicate("abcd"), -1);
    }

}
