public class StairCase {

    static void staircase(int n) {

        int i = 1;
        while(i < n){
            tab(n-i);
            print(i);
            System.out.println("");
            i++;
        }


    }

    static void print(int n){
        int i = 1;

        while(i<=n){
            System.out.print("#");

            i++;
        }


    }
    static void tab(int n){
        int i = 1;
        while(i<n){
            System.out.print(" ");
            i++;

        }

    }


    public static void main(String[] args) {
        staircase(6);

    }
}
