import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class PlusMinus {


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,0,0,-5,-6};
        double intRP = 0.0;
        double intRZ = 0.0;
        double intRN = 0.0;
        DecimalFormat df = new DecimalFormat("0.000000");

        intRP = Double.valueOf(Arrays.stream(Arrays.stream(arr).toArray()).filter(i -> i>0).toArray().length)/arr.length;
        intRZ = Double.valueOf(Arrays.stream(Arrays.stream(arr).toArray()).filter(i -> i==0).toArray().length)/arr.length;
        intRN = Double.valueOf(Arrays.stream(Arrays.stream(arr).toArray()).filter(i -> i<0).toArray().length)/arr.length;

        System.out.println(df.format(intRP));
        System.out.println(df.format(intRZ));
        System.out.println(df.format(intRN));

    }
}
