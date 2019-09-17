import org.junit.Assert;


public class ex3Test {
    @org.junit.Test
    public void calculateTest1() throws Exception {
        Assert.assertEquals(ex3.reverseString(new String("Hello World!")), "!dlroW olleH");
    }

    @org.junit.Test
    public void calculateTest2() throws Exception {
        Assert.assertEquals(ex3.reverseString(new String("abcde")), "edcba");
    }

}