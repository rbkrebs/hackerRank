import java.util.Scanner;

public class JavaLoopsI {

    static void print(int N){
        int i = 1;
        while (i<=10){
            System.out.println(String.format("%d x %d = %d", N,i, N*i));
            i++;
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        print(N);
        scanner.close();
    }


}
