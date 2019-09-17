import org.junit.Assert;


public class ex2Test {
    @org.junit.Test
    public void calculateTest1() throws Exception {
        Assert.assertEquals(ex2.twoSum(new int[]{1,2,3,4},5), true);
    }

    @org.junit.Test
    public void calculateTest2() throws Exception {
        Assert.assertEquals(ex2.twoSum(new int[]{1,4,5,1,6}, 12), false);
    }

}