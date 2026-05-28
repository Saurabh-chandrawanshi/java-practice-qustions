import java.util.Scanner;

public class avg3 {
 public static double findAverage(int a , int b, int c){
  
   return a + b + c / 3.0;
     
    }
    public static void main(String []args){
        Scanner src = new Scanner(System.in);
        System.out.println("enter  your any three number");
        int num1 = src.nextInt();
       int num2 = src.nextInt();
       int num3 = src.nextInt();

      double avg  = findAverage(num1,num2,num3);
      System.out.println("THis is avg = "+avg );
      src.close();
    
}
}
