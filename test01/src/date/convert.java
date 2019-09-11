package date;
import java.text.*;
import java.util.*;
public class convert {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("Current Date is:" + d1);

        long num= 1561554154352L;
        Date d2 = new Date(num);
        System.out.println("Converted Date From long is:"  + d2);
        System.out.println("Converted Long From Date is:"  + d2.getTime());

    }
}
