import java.util.Scanner;

public class JavaLoopsII {


    static void loopJavaII(int a, int b, int n){

        for(int i = 0; i < n; i++){
            a += Math.pow(2,i)*b;
            System.out.print(a);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            loopJavaII(a,b,n);
            System.out.println("");
        }

        in.close();

    }
}
