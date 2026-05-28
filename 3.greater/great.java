import java.util.Scanner;
public class great {
    public static void greatvalue(int num1 , int num2){
     int result = (num1>=num2) ? num1 :num2;
     System.out.println(" greater value is = "+result);
    }
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println( " enter first value ");
        int a = src.nextInt();
        System.out.println( " enter Second value ");
        int b = src.nextInt();

        greatvalue(a, b);
        src.close();

    }
}
