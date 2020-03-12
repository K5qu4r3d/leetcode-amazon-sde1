import java.util.Arrays;

public class Javabrushup{
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (double d : arr) {
            System.out.print( d + ",");
        }
        System.out.println(Arrays.toString(arr));
    }
}
