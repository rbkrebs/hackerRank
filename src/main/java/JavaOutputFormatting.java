import java.util.Scanner;
/*
Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each
integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using
exactly  characters.
The second column contains the integer, expressed in exactly  digits;
if the original input has less than three digits, you must pad your
output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================

*/

public class JavaOutputFormatting {

    static String intToString(int i){
        char[] intToString = String.valueOf(i).toCharArray();
        if(intToString.length <3){
            char[] newCharList = new char[3];
            int counter1 = 0;
            while(counter1<(3-intToString.length)){
                newCharList[counter1] = '0';
                counter1++;
            }
            int counter2 = 0;
            while(counter2<(intToString.length)){
                newCharList[counter1] = intToString[counter2];
                counter1++;
                counter2++;
            }
            return new String(newCharList);
        }
        return new String(intToString);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            for(int j=0;j<(15-s1.length());j++){
                System.out.print(" ");
            }
            System.out.println(intToString(x));


        }
        System.out.println("================================");

    }
}
