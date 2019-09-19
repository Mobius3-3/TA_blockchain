import junit.framework.TestCase;

public class testCaseUse extends TestCase{

    @Override
    protected void setUp() throws Exception {

        // TODO Auto-generated method stub

        super.setUp();

        System.out.println("setUp , hashCode = "+hashCode());

    }

//    @Override
//    protected void tearDown() throws Exception {
//
//// TODO Auto-generated method stub
//
//        super.tearDown();
//
//        System.out.println("tearDown,hashCode = "+hashCode());
//
//    }

    public void testMethod1(){

        System.out.println("testMethod1 , hashCode = "+hashCode());

    }

    public void testMethod2(){

        System.out.println("testMethod2 , hashCode = "+hashCode());

    }

}