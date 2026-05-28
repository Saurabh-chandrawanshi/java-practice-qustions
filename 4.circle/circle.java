import java.util.Scanner;

public class circle {
    
    double area;
    public static void areaofcircle(int r){
        double pi = 3.14;
        
        System.out.println(2* pi * r); 
       
    }
public static void main(String []args){
    Scanner src = new Scanner(System.in);
    System.out.println("Enter the r = ");
    int a = src.nextInt();
    areaofcircle(a);
    src.close();
}
}
